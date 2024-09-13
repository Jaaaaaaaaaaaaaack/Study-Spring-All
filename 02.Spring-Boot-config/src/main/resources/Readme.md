# 自定义属性值
Spring Boot允许我们在application.properties下自定义一些属性，比如：
```properties
wcw.name=jack
wcw.age=30
```
定义一个BlogProperties Bean，通过@Value("${属性名}")来加载配置文件中的属性值：
```java
   @Value("${wcw.name}")
    private String name;
    @Value("${wcw.age}")
    private Integer age;
```
在属性非常多的情况下，也可以定义一个和配置文件对应的Bean：
```properties
conf.name=test
conf.age=25
conf.nickname=haha
#在配置文件中，各个属性可以相互引用
conf.whole=${conf.age}-${conf.nickname}
```
通过注解@ConfigurationProperties(prefix = "conf")指明了属性的通用前缀，通用前缀加属性名和配置文件的属性名一一对应。
```java
@ConfigurationProperties(prefix="conf")
public class ConfigBean {
    private String name;
    private Integer age;
    private String whole;
    // get,set略
}
```
除此之外还需在Spring Boot入口类加上注解@EnableConfigurationProperties({ConfigBean.class})来启用该配置：
```java
@SpringBootApplication
@EnableConfigurationProperties({ConfBean.class})
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
```
自定义配置文件
除了可以在application.properties里配置属性，我们还可以自定义一个配置文件。在src/main/resources目录下新建一个test.properties:
```properties
#test.properties
test.name=KangKang
test.age=25
```
定义一个对应该配置文件的Bean：
```java
@Configuration
@ConfigurationProperties(prefix="test")
@PropertySource("classpath:test.properties")
@Component
public class TestConfigBean {
    private String name;
    private int age;
    // get,set略
}
```
注解@PropertySource("classpath:test.properties")指明了使用哪个配置文件。要使用该配置Bean，同样也需要在入口类里使用注解@EnableConfigurationProperties({TestConfigBean.class})来启用该配置,使用@Configuration可以省略。
通过命令行设置属性值
在运行Spring Boot jar文件时，可以使用命令java -jar xxx.jar --server.port=8081来改变端口的值。这条命令等价于我们手动到application.properties中修改（如果没有这条属性的话就添加）server.port属性的值为8081。

如果不想项目的配置被命令行修改，可以在入口文件的main方法中进行如下设置：
```java
public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Application.class);
    app.setAddCommandLineProperties(false);
    app.run(args);
}
```

使用xml配置

虽然Spring Boot并不推荐我们继续使用xml配置，但如果出现不得不使用xml配置的情况，Spring Boot允许我们在入口类里通过注解@ImportResource({"classpath:some-application.xml"})来引入xml配置文件。

Profile配置

Profile用来针对不同的环境下使用不同的配置文件，多环境配置文件必须以application-{profile}.properties的格式命，其中{profile}为环境标识。比如定义两个配置文件：

application-dev.properties：开发环境

server.port=8080

application-prod.properties：生产环境

server.port=8081

至于哪个具体的配置文件会被加载，需要在application.properties文件中通过spring.profiles.active属性来设置，其值对应{profile}值。

如：spring.profiles.active=dev就会加载application-dev.properties配置文件内容。可以在运行jar文件的时候使用命令java -jar xxx.jar --spring.profiles.active={profile}切换不同的环境配置。