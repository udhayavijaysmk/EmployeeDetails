package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//to store
@RestController

public class Employee_Controller {
	@Autowired
	Employee_Service empser;
	
    @PostMapping(value="/add")
	
	public String saveDetails(@RequestBody Employee e) {
		return empser.saveDetails(e);
    }
 // to see   
//	@GetMapping(value="/show/{id}")
//	public Employee getDetails(@PathVariable int id) {
//		return empser.getDetails(id);
	
//	}
	@GetMapping(value="/show")
	public Employee getDetailsByParam(@RequestParam("id") int id, @RequestParam("name") String name) {
		return empser.getDetails(id,name);
	
	}
	/*
	 * // for update
	 * 
	 * @PutMapping(value="/update") public String updateInformation(@RequestBody
	 * Employee e) { return empser.updateInformation(e); } //for delete
	 * 
	 * @DeleteMapping(value="/delete/{id}") public String
	 * deleteInformation(@PathVariable Integer id) { return
	 * empser.deleteInformation(id); }
	 * 
	 * // QueryCalling
	 * 
	 * @GetMapping(value="/setviasal/{sal1}/{sal2}") public List<Employee>
	 * getBysal(@PathVariable int sal1,@PathVariable int sal2) { return
	 * empser.getBysal(sal1,sal2); }
	 */
	
	}
