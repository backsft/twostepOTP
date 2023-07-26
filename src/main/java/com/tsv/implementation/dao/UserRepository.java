package com.tsv.implementation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsv.implementation.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String emailId);
}
