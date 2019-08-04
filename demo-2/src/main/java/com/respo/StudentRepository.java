package com.respo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.model.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    
    List<Student> findByName(String name);
   // Student findById(String id);

	void save(Student student);
    
}
