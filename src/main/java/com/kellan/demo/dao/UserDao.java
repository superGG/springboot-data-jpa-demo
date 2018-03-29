package com.kellan.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kellan.demo.bean.User;


public interface UserDao extends JpaRepository<User, Long>{
	
}
