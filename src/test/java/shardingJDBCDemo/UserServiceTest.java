package shardingJDBCDemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import site.ilemon.entity.User;
import site.ilemon.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath*:spring/*.xml"})  
public class UserServiceTest {

	@Autowired
	private IUserService service;
	
	@Test
	public void testGetUserById(){
		User user = service.getUserById(4);
		System.out.println(user);
	}
	
	@Test
	public void testInsert(){
		User user = new User();
		user.setUserId(4);
		user.setUserName("李四");
		user.setBirthday("1299-01-01");
		user.setMobile("13612345671");
		user.setPassword("123456");
		int rs = service.insert(user);
		System.out.println(rs);
		assertTrue(rs > 0);
	}
}
