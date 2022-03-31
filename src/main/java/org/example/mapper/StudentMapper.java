package org.example.mapper;

import org.example.pojo.Student;
import org.example.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    //增加
    int addStudent(Student student);
    //删除
    int deleteStudent(int id);
    //更新
    int updateStudent(Student student);

    int deleteStudents(List<Integer> ids);
    //查询
    List<Student> findAllStudents();

    List<Student> findStudentsParams(Map<String,Object> map);


}
