package com.wcw.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wu
 * @create 2024/9/13 15:09
 */
@ConfigurationProperties(prefix = "conf")
public class ConfBean {
    private String name;
    private Integer age;
    private String nickname;

    private String whole;

    public String getWhole() {
        return whole;
    }

    public void setWhole(String whole) {
        this.whole = whole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
