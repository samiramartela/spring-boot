package com.insonestudio.cruddemo.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insonestudio.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOImpl implements StudentDAO {

	// define field for entity manager

	private EntityManager entityManager;

	// inject entity manager using constructor injection

	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	// implement save method

	@Override
	@Transactional
	public void save(Student theStudent) {
		entityManager.persist(theStudent);

	}

}
