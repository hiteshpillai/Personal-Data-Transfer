package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.bean.Employee;




@Repository
public class Dao implements Idao{
	
@PersistenceContext 
EntityManager myEmf;

@Override
public List<Employee> getEmployeeDetails() {
	
	String sql="select emp from Employee emp ";
	TypedQuery<Employee> qry=(TypedQuery<Employee>) myEmf.createQuery(sql);
	
	return qry.getResultList();
}
 
	
}
