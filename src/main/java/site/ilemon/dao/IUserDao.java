package site.ilemon.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.ilemon.entity.User;

/**
 * 用户dao层接口
 * @author andy
 */
@Repository
public interface IUserDao {

	public User getUserById(int id);
	
	public List<User> listUsers();
	
	public int insert(User user);
}
