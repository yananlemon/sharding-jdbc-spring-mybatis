package site.ilemon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.ilemon.dao.IUserDao;
import site.ilemon.entity.User;
import site.ilemon.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	public List<User> listUsers() {
		return userDao.listUsers();
	}

	public int insert(User user) {
		int rs = userDao.insert(user);
		//System.out.println(1/0);
		return rs;
	}

}
