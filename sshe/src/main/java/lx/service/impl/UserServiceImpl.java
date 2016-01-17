package lx.service.impl;

import java.io.Serializable;

import lx.dao.UserDao;
import lx.model.User;
import lx.service.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	private static final Logger log = Logger.getLogger(UserServiceImpl.class);
	
	private UserDao userDaoImpl;
	
	public UserDao getUserDaoImpl() {
		return userDaoImpl;
	}
	@Autowired
	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	@Override
	public void test() {
		log.info("你好，世界");
	}
	@Override
	public Serializable save(User user) {
		return userDaoImpl.save(user);
	}

}
