package com.arun.portal.service;

import com.arun.portal.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    List<Student> getAllStudentsByIds(List<Integer> ids);

    List<Student> getStudentsByFirstName(String firstName);

    List<Student> getStudentsByGrade(String grade);

    void addStudent(Student student);

    Student getStudentDetails(String firstName, String lastName);

    Student getStudentById(String id);
}
