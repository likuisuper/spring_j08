package tech.aistar.day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.aistar.entity.User;

/**
 * 本类用来演示: 自动装配
 *
 * @author: success
 * @date: 2020/9/27 9:33 上午
 */
public class TestAutoWire {


    @Test
    public void testByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");

        User u3 = (User) applicationContext.getBean("user");

        System.out.println(u3.getUserInfo());

    }
}
