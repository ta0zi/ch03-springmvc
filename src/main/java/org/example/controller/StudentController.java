/**
 * Copyright (C), 2015-2022, XXX有限公司
 * <p>
 * FileName: StudentController
 * <p>
 * Author:   taozi
 * <p>
 * Date:     2022/3/28 18:06
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package org.example.controller;


import org.example.pojo.Student;
import org.example.service.StudentService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author taozi

 * @create 2022/3/28

 * @since 1.0.0

 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    public String test(){
        return "success";
    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(Student student){
       int i = studentService.addStudent(student);
       if (i>0){
           return "添加成果";
       }
        return "添加失败";
    }




}
