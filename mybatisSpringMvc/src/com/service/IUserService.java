package com.service;

import java.util.List;

import com.entity.Article;
import com.entity.UserTable;
public interface IUserService {
	public UserTable queryUser(int id);
	public List<UserTable> selectUsers();
	public void addUser(UserTable user);
	public List<UserTable> mytables();
}
