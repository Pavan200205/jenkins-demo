package com.example.demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepositClass extends CrudRepository<Users, Integer>{	//users table is created
}