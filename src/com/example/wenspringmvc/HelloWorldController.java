package com.example.wenspringmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//create controller class
@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	//create showForm method
	@RequestMapping("/showForm")
	public String showForm(){
		
		return "hello-world-form";
	}
	
	//create confirmation method
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld-confirm";
	}
	//new controller method to read form data and 
	//add data to model
	@RequestMapping("/processFormVersionTwo")
	public String lesshout(HttpServletRequest request, Model model){
		//read param from form
		String studentName = request.getParameter("studentname");
		//process data
		studentName = studentName.toUpperCase();
		//add model
		String message = "Yo! "+studentName;
		model.addAttribute("message", message);
		
		return "helloworld-confirm";
	}
	//annotation request param binding
	@RequestMapping("/processFormVersionThree")
	public String lesshoutDude(@RequestParam("studentname") String studentName, Model model){
		studentName = studentName.toUpperCase();
		String message = "Yo Yo! "+studentName;
		model.addAttribute("message", message);		
		return "helloworld-confirm";
	}

}
