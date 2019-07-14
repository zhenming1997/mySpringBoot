package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	@Transactional
	public int insUser(String username, String password) {
		return userMapper.insUser(username, password);
	}

	@Override
	public User selUser(int id) {
		// TODO Auto-generated method stub
		return userMapper.selUser(id);
	}

	@Override
	public List<User> selAll() {
		// TODO Auto-generated method stub
		return userMapper.selAll();
	}

}
