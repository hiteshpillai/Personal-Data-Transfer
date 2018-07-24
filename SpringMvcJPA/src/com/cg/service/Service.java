package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.bean.Employee;
import com.cg.dao.Idao;

@org.springframework.stereotype.Service
public class Service implements IService{
 @Autowired Idao daoObj;
	@Override
	public List<Employee> getEmployeedetails() {
		// TODO Auto-generated method stub
		return daoObj.getEmployeeDetails();
	}

}
