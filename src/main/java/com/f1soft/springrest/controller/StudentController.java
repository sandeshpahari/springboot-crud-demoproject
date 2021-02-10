/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.springrest.controller;

import com.f1soft.springrest.dao.StudentDto;
import com.f1soft.springrest.entity.Student;
import com.f1soft.springrest.exception.StudentNotFoundException;
import com.f1soft.springrest.service.StudentServiceImpl;
import com.f1soft.springrest.util.StudentUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@CrossOrigin("*")
@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;
    

    @PostMapping("/Students")
    public Student saveStudent(@RequestBody StudentDto studentDto) {
        return studentService.saveStudent(StudentUtil.convertToStudent(studentDto));
    }

    @PostMapping("/saveStudents")
    public List<Student> saveStudent(@RequestBody List<Student> students) {
        return studentService.saveStudents(students);
    }

    @GetMapping("/Students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

//    @RequestMapping(value = "/Students/{id}")
//    public Student getStudentById(@PathVariable int id){
//        return studentService.getStudentByID(id);
//        
//    }
    @RequestMapping(value = "/Students/{id}")
    public ResponseEntity<Object> getStudentById(@PathVariable int id) {
        Student student = studentService.getStudentByID(id);
        if (student == null) {
            throw new StudentNotFoundException();
        }

        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("/Students/{id}")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/Students")
    public String deleteProduct(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/show")
    public void show() {
        System.out.println("Aop Called");
    }
}
