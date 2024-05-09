package com.lgf.service;

import com.lgf.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service层，将domain层进行依赖注入，进行相应业务逻辑的编写
 * @author 李冠锋
 * @date 2024/5/8 下午9:06
 */
public interface StudentService {
    public Student getStudent();
}
