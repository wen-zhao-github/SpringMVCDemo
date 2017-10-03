package com.example.wenspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//create controller class
@Controller
public class HomeController {
	
    //create controller method
	@RequestMapping("/")
	public String showPage(){
		//return view
		return "main-menu"; //prefix and suffix will be added according to the config
	}
}
