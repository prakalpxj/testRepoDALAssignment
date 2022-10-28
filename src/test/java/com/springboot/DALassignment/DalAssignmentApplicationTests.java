package com.springboot.DALassignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.DALassignment.entities.Student;
import com.springboot.DALassignment.repos.StudentRepos;

@SpringBootTest
class DalAssignmentApplicationTests {
	
	@Autowired
	StudentRepos repos;
	
	
	@Test
	void testInsertion() {
		Student student = new Student();
		student.setName("Prakalp");
		student.setEmail("Prakalp5may@gmail.com");
		repos.save(student);	
		
	}

}
