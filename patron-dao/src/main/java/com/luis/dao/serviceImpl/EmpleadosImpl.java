package com.luis.dao.serviceImpl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.luis.dao.Entity.EmpleadosEntity;
import com.luis.dao.service.IEmpleados;

@Repository
public class EmpleadosImpl implements IEmpleados{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public List<EmpleadosEntity> allEmpleados() {
		return entityManager.createQuery("from EmpleadosEntity").getResultList();
	}

	@Override
	@Transactional
	public void save(EmpleadosEntity empleado) {
		entityManager.persist(empleado);
		
	}

}
