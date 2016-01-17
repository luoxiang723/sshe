package lx.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import lx.dao.UserDao;
import lx.model.User;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDaoImpl")
public class UserDaoImpl<T> implements UserDao<T> {
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public Serializable save(User user) {
		return this.sessionFactory.getCurrentSession().save(user);
	}

}
