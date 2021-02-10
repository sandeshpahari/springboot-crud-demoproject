/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.springrest.service;

import com.f1soft.springrest.dao.StudentDto;
import com.f1soft.springrest.entity.Student;
import java.util.List;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> saveStudents(List<Student> students);
    public List<Student> getAllStudents();
    public Student getStudentByID(int id);
    public String deleteStudent(int id);
    public Student updateStudent(Student student);
    
}
