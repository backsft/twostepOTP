package com.tsv.implementation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsv.implementation.model.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByRole(String name);
}
