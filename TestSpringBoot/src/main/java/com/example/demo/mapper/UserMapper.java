package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.example.demo.pojo.User;

public interface UserMapper {

	@Insert("insert into user values(default,#{0},#{1})")
	public int insUser(String username, String password);

	@Select("select * from user where id=#{0}")
	public User selUser(int id);

	public List<User> selAll();
}
