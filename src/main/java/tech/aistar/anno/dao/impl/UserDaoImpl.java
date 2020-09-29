package tech.aistar.anno.dao.impl;

import org.springframework.stereotype.Repository;
import tech.aistar.anno.dao.IUserDao;

/**
 * 本类用来演示: 注解的方式
 *
 * @author: cxylk
 * @date: 2020/9/27 10:04 上午
 */
//@Repository //等同于<bean id="userDaoImpl" class="...">

@Repository("usersDao")////等同于<bean id="usersDao" class="...">

//@Component("usersDao")
public class UserDaoImpl implements IUserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl...");
    }

    @Override
    public void save() {
        System.out.println("dao...save");
    }
}
