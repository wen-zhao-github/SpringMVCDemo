package com.example.wenspringmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	private String coursePrefix;
	@Override
	public void initialize(CourseCode courseCode){
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String coursename, ConstraintValidatorContext constrainValidationContext) {
		// TODO Auto-generated method stub
		if (coursename == null){
			return true;
		}else{
			return  coursename.startsWith(coursePrefix);
		}	
		
	}	
}
