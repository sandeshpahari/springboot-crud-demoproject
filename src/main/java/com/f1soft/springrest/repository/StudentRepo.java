/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.springrest.repository;

import com.f1soft.springrest.dao.StudentDto;
import com.f1soft.springrest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
}
