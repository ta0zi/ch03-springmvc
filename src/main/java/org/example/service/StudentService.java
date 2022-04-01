/**
 * Copyright (C), 2015-2022, XXX有限公司
 * <p>
 * FileName: StudentService
 * <p>
 * Author:   taozi
 * <p>
 * Date:     2022/3/28 3:34
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package org.example.service;


import org.example.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author taozi

 * @create 2022/3/28

 * @since 1.0.0

 */

public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudents();

}
