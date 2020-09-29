package tech.aistar.day01.dao.impl;

import tech.aistar.day01.dao.IUserDao;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/27 12:53
 */
public class UserDaoImpl2 implements IUserDao {
    public UserDaoImpl2() {
        System.out.println("UserDaoImpl...");
    }
    @Override
    public void save() {
        System.out.println("dao2...save");
    }
}
