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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author taozi

 * @create 2022/3/28

 * @since 1.0.0

 */

@Controller
@RequestMapping("/student")

public class StudentController {
    @Resource
    private StudentService service;

    //添加学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv =new ModelAndView();
        String tips = "注册失败";
        //调用service处理
        int nums = service.addStudent(student);
        if(nums > 0){
            tips = "学生【"+student.getName()+"】注册成功";
        }
        //添加数据
        mv.addObject("tips", tips);
        //指定结果页面(逻辑名称)
        mv.setViewName("result");
        return mv;
    }

    //查询 返回json
    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent(Student student){
        //省略参数检查以及数据处理
        List<Student> students = service.findStudents();
        return students;
    }
}
