package com.luis.dao.service;

import java.util.List;

import com.luis.dao.Entity.EmpleadosEntity;

public interface IEmpleados {

	public List<EmpleadosEntity> allEmpleados();
	
	public void save(EmpleadosEntity empleado);
}
