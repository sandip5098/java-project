package com.employee_management_System.service;

import java.util.ArrayList;
import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_management_System.dao.EmployeeDataDao;
import com.employee_management_System.entityClass.Employeedata;


@Service
public class EmployeeDataService {
	@Autowired
	EmployeeDataDao edd;
	
//1.
	public List BussinessLogic() {
		edd.ClientCode();
		return edd.ClientCode();
	}
	
//2.
	public List getEqualService() {
		edd.getEqualTo();
		return edd.getEqualTo();
	}
//3.
	public String insertToService(List<Employeedata> emp) {
		String msg = edd.insertData(emp);
		return msg;
	}
	
//4
	public List notEqualService() {
		edd.notEqual();
		return edd.notEqual();
	}
//5
	public String updateService(List<Employeedata> emp) {
		String msg = edd.update(emp);
		return msg;
	}
//6
	public void DeleteServiceData( int id) {
		 edd.DeleteData(id);
			}
//7
	public List betweenService() {
		edd.getBetweendata();
		return edd.getBetweendata();
	}
//8
	public void updateServiceById( int id) {
		edd.updateById(id);
	}
//9
		public List getDataByIdService() {
			return edd.getById();
		}
//10
		public List getLessSalaryInService() {
			return edd.getSalaryLessThan();	
		}
//11
		public List getGreaterThanInService() {
			return edd.getSalaryGT();	
		}
//12
		public List getGreaterThanEqualInService() {
		    return edd.getGreaterThanEqualsto();
		}
//13
		public List getLessThanEqualExperienceInService( ) {
			return edd.getLessThanEqualExperience();
		}
	}
	

