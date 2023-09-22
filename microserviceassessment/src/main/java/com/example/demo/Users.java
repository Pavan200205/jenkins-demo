
package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Users {
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)  // to generate primary key in table
	private Integer age;   //declaring parameters
	private String name;
	private String status;
	public Integer getAge() {   //get method for age
		return age;
	}
	public String getStatus() {  //get method for Status
		return status;
	}
	public void setStatus(String status) {  //set method for Status
		this.status = status;
	}
	public void setId(Integer age) {    //  set method for age
		this.age = age;
	}
	public String getName() {   // get method for name
		return name;
	}
	public void setName(String name) {  //set method for name
		this.name = name;
	}
}

