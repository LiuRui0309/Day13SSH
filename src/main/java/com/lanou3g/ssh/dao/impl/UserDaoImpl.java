package com.lanou3g.ssh.dao.impl;

import com.lanou3g.ssh.dao.UserDao;
import com.lanou3g.ssh.domain.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;


/**
 * Created by dllo on 17/11/8.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User register(User user) {
        //插入数据
        getHibernateTemplate().save(user);
        return null;
    }
}
