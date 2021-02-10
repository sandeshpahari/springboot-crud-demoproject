/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.springrest.service;

import com.f1soft.springrest.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.f1soft.springrest.repository.StudentRepo;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@Service
public class StudentServiceImpl implements StudentService{
    
    @Autowired
    private StudentRepo studentRepo;
    
    @Override
    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }
    @Override
    public List<Student> saveStudents(List<Student> students){
        return studentRepo.saveAll(students);
    } 
    @Override
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
    @Override
    public Student getStudentByID(int id){
          return studentRepo.findById(id).orElse(null);
    }
  
    @Override
    public String deleteStudent(int id){
        studentRepo.deleteById(id);
        return "Student Removed"+id;
    }
    
    @Override
    public Student updateStudent(Student student) {
        Student existingStudent = studentRepo.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setGrade(student.getGrade());
        existingStudent.setMajor(student.getMajor());
        return studentRepo.save(existingStudent);
    }

}
