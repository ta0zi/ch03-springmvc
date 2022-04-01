/**
 * Copyright (C), 2015-2022, XXX有限公司
 * <p>
 * FileName: StudentServiceImpl
 * <p>
 * Author:   taozi
 * <p>
 * Date:     2022/3/31 17:46
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
import org.example.pojo.Student;
import org.example.service.StudentService;
import org.example.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public int addStudent(Student student) {
        int nums = studentMapper.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudents() {
        return studentMapper.selectStudents();
    }
}
