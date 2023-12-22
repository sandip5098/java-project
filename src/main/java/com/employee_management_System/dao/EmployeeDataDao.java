package com.employee_management_System.dao;

import java.util.List; 

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee_management_System.entityClass.Employeedata;



@Repository

public class EmployeeDataDao {
	@Autowired
	SessionFactory sf;
	
//1. Write an api to get all record
	public List ClientCode() {
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(Employeedata.class);
	return criteria.list();
	}
	
//2.Write an api who is having fname equal to rahul
	public List getEqualTo() {
		Session session =sf.openSession();
		Criteria criteria = session.createCriteria(Employeedata.class);
		criteria.add(Restrictions.eq("fname", "Rahul"));
		
		return criteria.list();
	}
	
	//3. Write an api to insert enployeedata
	public String insertData(List<Employeedata> emp) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (Employeedata obj : emp) {
			session.save(obj);
		}
		tr.commit();
		return "Data inserted Successful";
	}
	
//	4. Write an api who is having designation not equal to web developer. 
	public List notEqual() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employeedata.class);
		criteria.add(Restrictions.ne("designation", "Web Devloper"));
		return criteria.list();	
		}
	
	// 5.
	public String update(List<Employeedata> emp) {
		Session session = sf.openSession();
	    Transaction tr = session.beginTransaction();
	    for (Employeedata ed : emp) {
			session.update(ed);
			tr.commit();
		}
	    return "Data successfully update";
	}
	
	// 6.delete data by id
	public void DeleteData( int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employeedata eobject = session.get(Employeedata.class, id);
		session.delete(eobject);
		tr.commit();
		
	}
	//7.
	public List getBetweendata() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employeedata.class);
		criteria.add(Restrictions.between("salary", "20000", "30000"));
		return criteria.list();
	
		
	}
	//8. update by id
	public void updateById(int id) {
		Session session = sf.openSession();
	    Transaction tr = session.beginTransaction();
	 Employeedata emp = session.get(Employeedata.class, id);
		 session.update(emp);
			tr.commit();
}
	// 9.get by id using like method
	public List getById() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employeedata.class);
		criteria.add(Restrictions.like("id", 3));
	
		return  criteria.list();
	}
	
	// 10. Write an api who is having less than salary 30000.
	
	public List getSalaryLessThan() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employeedata.class);
		criteria.add(Restrictions.lt("salary", "30000"));
		return criteria.list();
	}
	
	// 11.Write an api who is having greater Than 30000.
	public List getSalaryGT() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employeedata.class);
		criteria.add(Restrictions.gt("salary", "30000"));
		criteria.list();
		System.out.println(criteria.list());
		return criteria.list();
	}
	
	// 12.Write an api who is having age greater than equals to  28.
	public List getGreaterThanEqualsto() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employeedata.class);
		criteria.add(Restrictions.ge("age", 30));
		System.out.println(criteria.list());
		 return criteria.list();
	}
	
	// 13. Write an api who is having Experience is less than equal to 2 years.
	public List getLessThanEqualExperience() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employeedata.class);
		criteria.add(Restrictions.le("experience", "3 Years"));
		System.out.println(criteria.list());
		return criteria.list();
	}
	
}