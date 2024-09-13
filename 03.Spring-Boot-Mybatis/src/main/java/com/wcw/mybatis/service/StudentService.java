package com.wcw.mybatis.service;

import com.wcw.mybatis.domain.Student;

/**
 * @author wu
 * @create 2024/9/13 17:03
 */
public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}
