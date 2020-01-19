package com.luis.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.luis.app.service.IService;
import com.luis.app.service.MyService;
import com.luis.app.service.MyServiceComplejo;

@Configuration
public class AppConfig {

	@Bean("simple")
	public IService registroServiceSimple() {
		return new MyService();
	}
	
	@Primary
	@Bean("complejo")
	public IService registroServiceComplejo() {
		return new MyServiceComplejo();
	}
}
