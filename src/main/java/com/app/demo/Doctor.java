package com.app.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	private String name;
	private int age;
	
	
	
	
	public Doctor() {
	
	}
	public Doctor(int did, String name, int age) {

		this.did = did;
		this.name = name;
		this.age = age;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
