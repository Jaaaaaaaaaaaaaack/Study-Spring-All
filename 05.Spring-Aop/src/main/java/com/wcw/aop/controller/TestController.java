package com.wcw.aop.controller;


import com.wcw.aop.annotation.Log;
import com.wcw.aop.domain.Student;
import com.wcw.aop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wu
 * @create 2024/9/13 17:04
 */
@RestController
public class TestController {

    @Autowired
    private StudentService studentService;

    @Log(value = "测试")
    @RequestMapping( value = "/querystudent", method = RequestMethod.GET)
    public Student queryStudentBySno(String id) throws InterruptedException {
        int i = (int) (Math.random() * 1000);
        Thread.sleep(i);
        return this.studentService.getById(id);
    }
}