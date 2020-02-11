package com.qst.dao;

import org.apache.ibatis.annotations.Param;

import com.qst.entity.User;

public interface UserMapper {

	User userlogin(@Param(value="username")String username,@Param(value="password")String password);
	User getuser(@Param(value="username")String username);
	void register(@Param(value="username")String username,@Param(value="password")String password);
}
