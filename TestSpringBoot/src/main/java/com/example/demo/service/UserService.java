package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.User;

public interface UserService {

	public int insUser(String username, String password);

	public User selUser(int id);

	public List<User> selAll();
}
