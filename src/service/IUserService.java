package service;

import java.util.List;

import entity.User;

public interface IUserService {

	public List<User> queryUserByLogin(User user);
	
	 public void saveUser(User user);
}
