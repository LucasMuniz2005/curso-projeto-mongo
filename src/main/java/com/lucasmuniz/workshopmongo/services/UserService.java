package com.lucasmuniz.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasmuniz.workshopmongo.domain.User;
import com.lucasmuniz.workshopmongo.reporsitory.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		 return repo.findAll();
	}

}
