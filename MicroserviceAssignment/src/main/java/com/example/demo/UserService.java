package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
	UserReposit repository;
	void saveUser(Users user){
		repository.save(user);
		System.out.println("user created "+user.getName());
		System.out.println("user age "+user.getAge());
		System.out.println("user status "+user.getStatus());
	}
}