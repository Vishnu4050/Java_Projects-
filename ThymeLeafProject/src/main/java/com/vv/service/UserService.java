package com.vv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vv.entity.User;
import com.vv.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository rep;
	
	public User save(User u) {
		return rep.save(u);
	}
	
	public List<User> getAll(){
		return rep.findAll();
	}
	
	public Optional<User> getByID(long id){
		return rep.findById(id);
	}
	
	public void delete(long id) {
		if(!rep.existsById(id)) throw new IllegalArgumentException();
		rep.deleteById(id);
	}
	
}
