package tech.aistar.day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.aistar.entity.Car;
import tech.aistar.entity.User;

import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/27 14:29
 */
public class TestDI {
    @Test
    public void testUser(){
        //1. 加载读取src/main/resources/spring01.xml

        //默认是单例的.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");

        //2. 从容器中获取指定的bean - 只是在使用bean
        //字符串就是代表bean标签的id属性的名称
        //User user = (User) applicationContext.getBean("user");//ok

        User user = applicationContext.getBean("user",User.class);//ok


        //如果配置文件配置多个相同class的bean,抛出org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        //User u2 = applicationContext.getBean(User.class);//ok
        System.out.println(user);
    }

    @Test
    public void testList(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-di.xml");
        User u2= (User) applicationContext.getBean("u2");
        List<Car> carList=u2.getCars();
        carList.forEach(System.out::println);

    }

    @Test
    public void testUserInfo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");

        User u3 = (User) applicationContext.getBean("u3");

        System.out.println(u3);

        System.out.println(u3.getUserInfo());
    }
}
