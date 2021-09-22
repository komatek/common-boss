package com.test.service;

import com.test.domain.UserTest;

public interface UserService {

	UserTest findCommonBoss(UserTest user1, UserTest user2);

	UserTest findByName(String name);

}
