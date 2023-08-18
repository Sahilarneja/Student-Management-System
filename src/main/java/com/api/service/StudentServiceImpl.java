package com.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.entities.Student;
import com.api.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student updateStudent(Student student) {

		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}


	@Override
	public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);;
	}
	
	
}
