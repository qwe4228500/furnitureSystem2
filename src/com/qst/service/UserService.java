package com.qst.service;

import com.qst.entity.User;

public interface UserService {
//登录	
User userlogin(String username,String password);
User getuser(String username);
void register(String username,String password);
}
