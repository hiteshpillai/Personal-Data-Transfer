package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.bean.Employee;
import com.cg.service.IService;



@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	IService serObj;
	public Controller() {
		System.out.println("egtfrgvd");
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/index")
	public String ToAddEmployee(Model model)
	{
		List<Employee> list=serObj.getEmployeedetails();
		model.addAttribute("list", list);
		return "showEmp";
		
	}
	
	/*@RequestMapping("showEmp")
	public String showEmployee(@Valid @ModelAttribute("emp")Employee emp,BindingResult result,Model model)
	{

	Employee bean = null;
	return null;*/
}
