package com.example.wenspringmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	@RequestMapping("/processForm")
	//Spring store validate result in BindingResult
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult){
		System.out.println("First Name:|"+customer.getFirstName()+"|"
			+customer.getLastName()+"|");
		System.out.println("bindingResult: "+bindingResult+"\n");
		if (bindingResult.hasErrors()){//binding result will check both text field and number
			return "customer-form";
		}else{
			return "customer-confirm";
		}
		
	}

}
