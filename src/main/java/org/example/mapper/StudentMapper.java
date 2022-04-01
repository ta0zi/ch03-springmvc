package org.example.mapper;

import org.example.pojo.Student;
import org.example.pojo.Student;

import java.util.List;
import java.util.Map;


public interface StudentMapper {
    int insertStudent(Student student);
    List<Student> selectStudents();

}