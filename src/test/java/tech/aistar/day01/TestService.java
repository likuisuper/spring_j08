package tech.aistar.day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.aistar.day01.service.IUserService;

/**
 * 本类用来演示:
 *
 * @author: cxylk
 * @date: 2020/9/27 10:20 上午
 */
public class TestService {
    @Test
    public void testSave(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-db.xml");

        //获取到service对象
        IUserService userService = (IUserService) context.getBean("userService");

        userService.save();
    }
}
