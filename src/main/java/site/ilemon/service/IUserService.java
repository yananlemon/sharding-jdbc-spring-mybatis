package site.ilemon.service;

import java.util.List;

import site.ilemon.entity.User;

public interface IUserService {

public User getUserById(int id);
	
	public List<User> listUsers();
	
	public int insert(User user);
}
