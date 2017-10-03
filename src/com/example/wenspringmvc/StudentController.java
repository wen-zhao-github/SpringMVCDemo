package com.example.wenspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		//create new student object
		Student theStudent = new Student();		
		//add student as model attribute
		model.addAttribute("student", theStudent);
		
		return "student-form";
		
	}@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		
		System.out.println("the student: "+theStudent.getFirstName()+" "+theStudent.getLastName());
		
		return "student-confirmation";
	}

}
