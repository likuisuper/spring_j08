package tech.aistar.anno.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.aistar.anno.dao.IUserDao;
import tech.aistar.anno.service.IUserService;

/**
* 注解
 *
 * @author: cxylk
 * @date: 2020/9/27 10:05 上午
 */
@Service // <bean id="userServiceImpl" class="....">
//@Component
public class UserServiceImpl implements IUserService {

    public UserServiceImpl(){
        System.out.println("service...");
    }

    //自动装配
    //byType
    //byName

    //1 - 默认先根据byType来找,如果内存中的类型是唯一的,则成功自动装配.
    //2 - 如果发现根据byType找到了多个bean,继续根据byName
    @Autowired
    private IUserDao usersDao;


    @Override
    public void save() {
        System.out.println("====");
        usersDao.save();
        System.out.println("====");
    }
}
