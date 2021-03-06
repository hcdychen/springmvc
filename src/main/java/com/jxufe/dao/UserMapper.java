package com.jxufe.dao;

import java.util.List;

import com.jxufe.entity.User;

public interface UserMapper {

	public List<User> findAll();
	public String findByName(String username);
	public void insertUser(User user);
	public User findByCode(String code);
	public void updateActive(User user);
	public User findUser(User user);
}
