package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceClass {  
	@Autowired
	UserRepositClass repository; //repository reference is created using UserRepositClass
	void saveUser(Users user){
		repository.save(user);
		System.out.println("user created "+user.getName());  //to print name of user
		System.out.println("user age is "+user.getAge());    // to print age of user
		System.out.println("user status is "+user.getStatus());  // to print status of user
	}
}