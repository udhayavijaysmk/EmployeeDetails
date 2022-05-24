package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Employee_Service {
	
	@Autowired
	Employee_Repo employeeRepo;
	@Autowired
	Employee_Dao empdao;
	//public String saveDetails(Employee e) {
	//	return empdao.saveDetails(e);
	//}
	public String saveDetails(Employee e) {
			 employeeRepo.save(e);
			 return "Saved successfully";
		}
	
//	public Employee getDetails(int id) {
//		return empdao.getDetails(id,);
//	}
	
	public  Employee getDetails(int id) {
	return employeeRepo.getById(id);
	}
	
	public Employee getDetails(int id, String name) {
		return employeeRepo.findByIdAndName(id,name);
	}
	/*
	 * public String updateInformation(Employee e) { return
	 * empdao.updateInformation(e); } public String deleteInformation(Integer id) {
	 * return empdao.deleteInformation(id); } public List<Employee> getBysal(Integer
	 * sal1,Integer sal2) { return empdao.getBysal(sal1,sal2); }
	 */
}
