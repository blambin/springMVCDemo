package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import entity.User;
import mapper.IUserMapping;
import service.IUserService;


public class UserService implements IUserService {

	@Autowired
	private IUserMapping userMapping;
	
	@Override
	public List<User> queryUserByLogin(User user) {
		return this.userMapping.queryUserByLogin(user);
	}

	@Override
	public void saveUser(User user) {
		this.userMapping.saveUser(user);
	}
}
