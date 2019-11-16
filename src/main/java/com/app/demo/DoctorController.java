package com.app.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	@Autowired
	private DoctorRepo repo;
	
	
	@PostMapping("/add")
	public Doctor add(@RequestBody Doctor doctor) {
		
		repo.save(doctor);
		return doctor;
	}
	
	@GetMapping("/doctors")
	public List<Doctor> getDoctor(){
		
		return repo.findAll();
	}
	
	@GetMapping("/doctors/{did}")
	public Optional<Doctor> getDoctorById(@PathVariable("did")int id){
		return repo.findById(id); 
	}
	
	@DeleteMapping("/del/{did}")
	public String deldoctor(@PathVariable("did") int id) {
		
		Doctor d=repo.getOne(id);
		repo.delete(d);
		
		return "deleted succesfully";
	}
	
	@PutMapping("/doctors/update")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		repo.save(doctor);
		return doctor;
	}
}
