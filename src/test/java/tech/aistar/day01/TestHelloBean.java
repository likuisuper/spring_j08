package tech.aistar.day01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.aistar.entity.User;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/27 9:46
 */
public class TestHelloBean {
    @Test
    public void testUser(){
        //1.加载读取src/main/resources/spring01.xml
        //默认是单例的
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring01.xml");

        //2.从容器中获取指定的bean - 只是在使用bean
        //字符串就是代表bean标签的Id属性的名称
//        User user= (User) applicationContext.getBean("user");
//        System.out.println(user.getClass());

        User user=applicationContext.getBean("user",User.class);

        //如果配置文件配置多个相同class的bean(但不指定id)，抛出org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        //User u2=applicationContext.getBean(User.class);
        //System.out.println(u2);
    }
}
