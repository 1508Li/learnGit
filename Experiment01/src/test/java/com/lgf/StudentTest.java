package com.lgf;

import com.lgf.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试学生类属性配置
 * @author 李冠锋
 * @date 2024/5/8 下午9:42
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentTest {
    @Autowired
    private Student student;
    @Test
    public void contextLoads() {
        System.out.println(student);
    }
}
