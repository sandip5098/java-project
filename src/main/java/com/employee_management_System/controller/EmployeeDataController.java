package com.employee_management_System.controller;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee_management_System.entityClass.Employeedata;
import com.employee_management_System.service.EmployeeDataService;

@RestController
@CrossOrigin( origins = "http://localhost:4200/", maxAge = 3600 )
@RequestMapping("api/v1")
public class EmployeeDataController {
	@Autowired
	EmployeeDataService eds;
//1.get data
	@GetMapping("/employees")
	public List getdata() {
		
		eds.BussinessLogic();
	return eds.BussinessLogic();
	}
	
	//2.get data
	@GetMapping("/Getequaldata")
	public List getEqualController() {
	
		eds.getEqualService();
		return eds.getEqualService();
	}

	//3. insert data
	@PostMapping("/employees")
	public String addEmployee( @RequestBody List<Employeedata> emp) {
		String msg = eds.insertToService(emp);
		return msg;
	}
	
	//4. get not equal to employee 
	@GetMapping("/getnotequaldata")
	public List notEqualController() {
		eds.notEqualService();
		return eds.notEqualService(); 
	}
	
	//5.
	@PutMapping("/updatedate")
	public String updateCntroller(@RequestBody  List<Employeedata> emp) {
		String msg = eds.updateService(emp);
		return msg;
	}
	
	//6.
	@DeleteMapping("/deletedata/{id}")
	public String DeleteController(  @PathVariable int id) {
		eds.DeleteServiceData(id);
		return "employee has been deleted "+ id ;
	}
	
	//7.
	@GetMapping("/getbetweendata")
	public List betweenController() {
		eds.betweenService();
		return eds.betweenService();
	}
	
	//8.
	@PutMapping("/updatebyid/{id}")
	public String updateControllerById(@PathVariable int id ) {
		eds.updateServiceById(id);
		
		System.out.println(eds);
		
		return "Data has be updated "+id;
	}
	
	//9. get record by eq id
	@GetMapping("/getRecordbyid")
	public List getByIdController() {
		eds.getDataByIdService();
		return eds.getDataByIdService() ;
	}
	
	@GetMapping("/getlesssalarysalary")
	public List getlessSalaryInController() {
		return eds.getLessSalaryInService();
	}
	
	@GetMapping("getgreaterthansalary")
	public List getGreaterThanInController() {
	return	eds.getGreaterThanInService();
	}
	
	@GetMapping("/getGreaterThanEqualInController")
	public List getGreaterThanEqualInController() {
		return eds.getGreaterThanEqualInService();
	}
	@GetMapping("/getLessThanEqualExperienceInController")
	public List getLessThanEqualExperienceInController() {
		return eds.getLessThanEqualExperienceInService();
	}
	
}
