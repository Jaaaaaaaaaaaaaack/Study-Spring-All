package com.wcw.mybatis.mapper;

import com.wcw.mybatis.domain.Student;
import org.apache.ibatis.annotations.*;

/**
 * @author wu
 * @create 2024/9/13 16:57
 */
@Mapper
public interface StudentMapper {
    @Insert("insert into student(id,name,gender) values(#{id},#{name},#{gender})")
    int add(Student student);

    @Update("update student set name=#{name},dender=#{sex} where id=#{id}")
    int update(Student student);

    @Delete("delete from student where id=#{id}")
    int deleteBysno(String sno);

    @Select("select * from student where id=#{id}")
    @Results(id = "student",value= {
            @Result(property = "id", column = "id", javaType = Long.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "gender", column = "gender", javaType = String.class)
    })
    Student queryStudentBySno(String id);
}
