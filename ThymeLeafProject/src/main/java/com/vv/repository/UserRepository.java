package com.vv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vv.entity.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
