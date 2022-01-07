package com.example.department.weekfivedepartment.Controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.department.weekfivedepartment.Entity.Department;
import com.example.department.weekfivedepartment.Reposiotry.DepartmentRepository;


@RestController
public class DepartmentController {
	@Autowired
	private DepartmentRepository deptRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/create-department")
	private Department createCall(@RequestBody Department dept) {
		dept.setPaymentStatus(employeeStatus());
		return deptRepo.save(dept);
	}
	
	@PutMapping("/update-department")
	private Department updateCall(@RequestBody Department dept) {
		return deptRepo.save(dept);
	}
	
	@DeleteMapping("/delete-department")
	private String deleteCall(@RequestBody Department dept) {
		deptRepo.delete(dept);
		return "Employee Deleted";
	}
	
	@GetMapping("/get-alldepartment")
	private List<Department> getCall(){
		return deptRepo.findAll();
	}
	
//	@GetMapping("/get-allEmployeesinDept")
//	public List<Employee> getAllEmployees(){
//		List<Employee> jobj = restTemplate.exchange("http://localhost:9090/get-allEmployee", HttpMethod.GET,null,List.class).getBody();
//		return jobj;
//	}
//	@GetMapping("/employees")
//	public String getEmployees(){
//		String baseUrl = "http://localhost:9090/get-allEmployee";
//		restTemplate = new RestTemplate();
//		ResponseEntity<String> response=null;
//		try {
//		response=restTemplate.exchange(baseUrl, HttpMethod.GET, null ,String.class);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		System.out.println(response.getBody());
//		
//		return response.getBody().toString();
//	}
	public String employeeStatus() {
		//api should be 3rd party gateway
		return new Random().nextBoolean()?"Success":"false";
	}
}
