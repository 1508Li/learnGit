package com.lgf.controller;

import com.lgf.domain.Student;
import com.lgf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过@AutoWired将Service层进行依赖注入，然后调用Service层中的方法来处理业务逻辑
 * @author 李冠锋
 * @date 2024/5/8 下午9:07
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public Student saveStudent() {
        return studentService.getStudent();
    }
}
