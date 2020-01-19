package com.luis.app.service;

import org.springframework.stereotype.Component;

//@Component("complejo")
//@Primary
public class MyServiceComplejo implements IService {

	@Override
	public String operation() {
		return "Implementacion Complejo";
	}

	
}
