package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService UserService;

	@RequestMapping("/{name}")
	public User info(@PathVariable("name") String name) {
		User user = new User();
		user.setUsername("root");
		user.setPassword("123456");
		user.setName(name);
		return user;
	}

	@RequestMapping("/ins")
	public String ins(String username, String password) {
		int insUser = UserService.insUser(username, password);
		if (insUser > 0) {
			return "success";
		}
		return "错误";
	}

	@RequestMapping("/sel")
	public String sel(int id) {
		User selUser = UserService.selUser(id);
		System.out.println(selUser);
		return "success";
	}

	@RequestMapping("/selAll")
	public String selAll() {
		List<User> selAll = UserService.selAll();
		return "success";
	}
}
