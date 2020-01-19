package com.luis.app.service;

import org.springframework.stereotype.Component;

//@Component("simple")
public class MyService implements IService{

	@Override
	public String operation() {
		return "Implementacion Simple";
	}

	
}
