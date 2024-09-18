package com.wcw.jdbctemplate.dao;

import com.wcw.jdbctemplate.domain.Student;

import java.util.List;
import java.util.Map;

/**
 * @author wu
 * @create 2024/9/13 17:38
 */
public interface StudentDao {
     int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    List<Map<String, Object>> queryStudentsListMap();
    Student queryStudentBySno(String sno);
}
