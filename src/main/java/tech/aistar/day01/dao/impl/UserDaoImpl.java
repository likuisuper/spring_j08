package tech.aistar.day01.dao.impl;

import tech.aistar.day01.dao.IUserDao;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/27 12:53
 */
public class UserDaoImpl implements IUserDao {
    public UserDaoImpl() {
        System.out.println("UserDaoImpl...");
    }

    @Override
    public void save() {
        System.out.println("dao...save");
    }
}
