package com.lgf;

import com.lgf.controller.LgfController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 对LgfController的测试类，要么置于和启动类同样的目录下，要么@SpringBootTest(classes = {启动类.class})
 * @author 李冠锋
 * @date 2024/5/8 下午8:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {
    @Autowired
    private LgfController lgfController;
    @Test
    public void test() {
        String hello = lgfController.hello();
        System.out.println(hello);
    }
}
