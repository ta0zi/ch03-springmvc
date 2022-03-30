/**
 * Copyright (C), 2015-2022, XXX有限公司
 * <p>
 * FileName: StudentServiceImpl
 * <p>
 * Author:   taozi
 * <p>
 * Date:     2022/3/30 18:00
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package org.example.service.impl;


import org.example.mapper.StudentMapper;
import org.example.mapper.StudentMapper;
import org.example.pojo.Student;
import org.example.service.StudentService;
import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author taozi

 * @create 2022/3/30

 * @since 1.0.0

 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return deleteStudent(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student );
    }

    @Override
    public int deleteStudents(List<Integer> ids) {
        return studentMapper.deleteStudents(ids);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentMapper.findAllStudents();
    }

    @Override
    public List<Student> findStudentsParams(Map<String, Object> map) {
        return studentMapper.findStudentsParams(map);
    }
}
