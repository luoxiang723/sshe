package lx.service;

import java.io.Serializable;

import lx.model.User;

public interface UserService {
	public void test();
	
	public Serializable save(User user);
}
