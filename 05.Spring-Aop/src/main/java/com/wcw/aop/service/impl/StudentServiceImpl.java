package com.wcw.aop.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcw.aop.domain.Student;
import com.wcw.aop.mapper.StudentMapper;
import com.wcw.aop.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author wu
 * @create 2024/9/13 17:03
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
