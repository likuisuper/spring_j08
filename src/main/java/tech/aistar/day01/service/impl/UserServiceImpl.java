package tech.aistar.day01.service.impl;

import tech.aistar.day01.dao.IUserDao;
import tech.aistar.day01.service.IUserService;

/**
 * 本类功能:无状态的bean -service以及dao->配置spring
 * spring对bean管理默认是单例的
 *
 * 思考 - 由于UserServiceImpl是单例 - 多线程环境下共享userDao实例
 *
 * 因为userDaoImpl也是无状态的bean - 不会存在成员变量
 * 所有的线程仅仅都在调用无状态bean中的方法
 *
 * JMM - 每个线程在执行具体方法的时候，都会开辟线程[私有的，独立的空间]
 *
 * @author cxylk
 * @date 2020/9/27 12:57
 */
public class UserServiceImpl implements IUserService {
    public UserServiceImpl(){
        System.out.println("service...");
    }

    //传统的写法 -- 在程序中主动寻找对象 - 主动去new对象 -正转
    //弊端 - 使用对象和创建对象耦合在一块儿了
    //private IUserDao userDao=new UserDaoImpl();

    //反转 - 将对象的创建和注入[设置值]和应用程序进行分离
    private IUserDao userDao;

    //必须体用setter方法

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {

    }
}
