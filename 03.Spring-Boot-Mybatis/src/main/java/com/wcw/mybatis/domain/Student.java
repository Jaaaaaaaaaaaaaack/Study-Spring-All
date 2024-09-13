package com.wcw.mybatis.domain;

import java.io.Serializable;

/**
 * @author wu
 * @create 2024/9/13 16:54
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -339516038496531943L;
    private Long id;
    private String name;
    private String gender;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Student(Long id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
