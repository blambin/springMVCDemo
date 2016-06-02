package mapper;

import java.util.List;

import entity.User;

public interface IUserMapping {

	 public List<User> queryUserByLogin(User user);
	 
	 public void saveUser(User user);
}
