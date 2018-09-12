package service;

import mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daomain.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public void delUser(Integer id) {
		userMapper.deleteByPrimaryKey(id);
	}

	public User getUser(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public void modUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	public void addUser(User user) {
		userMapper.insert(user);
	}

	public int selectUser(User user) {
		return userMapper.selectByParams(user);		
	}

	public void insert(User user) {
		userMapper.insert(user);
	}

	public User qryUser(User user) {
		return userMapper.selectUser(user);
	}

}
