package lx.dao;

import java.io.Serializable;

import lx.model.User;

public interface UserDao<T> {
	public Serializable save(User user);
}
