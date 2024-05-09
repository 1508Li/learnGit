package com.lgf.config;

import com.lgf.domain.Student;
import com.lgf.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类，管理Service层实例
 * @author 李冠锋
 * @date 2024/5/8 下午9:06
 */
@Configuration
public class MyConfig implements StudentService{
    @Bean
    @Override
    public Student getStudent() {
        return new Student();
    }
}
