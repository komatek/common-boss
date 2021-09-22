package com.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.domain.UserTest;

public interface UserTestRepository extends CrudRepository<UserTest, Long> {
	UserTest findByName(String name);
}
