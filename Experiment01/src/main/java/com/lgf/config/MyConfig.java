package com.lgf.config;

import com.lgf.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类，管理Service层实例
 * @author 李冠锋
 * @date 2024/5/8 下午9:06
 */
@Configuration
public class MyConfig {
    @Bean
    public StudentService studentServiceConfig(){
        return new StudentService();
    }
}
