package com.anthonycardenasfullstack.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anthonycardenasfullstack.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
}
