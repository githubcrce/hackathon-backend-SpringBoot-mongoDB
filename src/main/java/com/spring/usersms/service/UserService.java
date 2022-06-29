package com.spring.usersms.service;

import com.spring.usersms.model.UserModel;

public interface UserService {

	UserModel findUserByPhone(String id);
}
