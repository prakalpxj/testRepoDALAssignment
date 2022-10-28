package com.springboot.DALassignment.repos;

import org.springframework.data.repository.CrudRepository;

import com.springboot.DALassignment.entities.Student;


public interface StudentRepos extends CrudRepository<Student, Integer> {

}
