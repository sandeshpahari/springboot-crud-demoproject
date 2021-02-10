/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.springrest.util;

import com.f1soft.springrest.dao.StudentDto;
import com.f1soft.springrest.entity.Student;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
public class StudentUtil {
    
        public static Student convertToStudent(StudentDto studentDto){
        Student student = new Student();
        
        if (studentDto != null) {
            try {
                student.setName(studentDto.getName());
                student.setGrade(studentDto.getGrade());
                student.setMajor(studentDto.getMajor());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
         return student;
    }
}
