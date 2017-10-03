package com.example.wenspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
    //different controller,same request mapping name
	@RequestMapping("/showForm")
	public String displayForm(){
		return "silly";
	}
}
