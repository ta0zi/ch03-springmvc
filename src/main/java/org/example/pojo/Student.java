/**
 * Copyright (C), 2015-2022, XXX有限公司
 * <p>
 * FileName: Students
 * <p>
 * Author:   taozi
 * <p>
 * Date:     2022/3/28 3:31
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package org.example.pojo;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author taozi

 * @create 2022/3/28

 * @since 1.0.0

 */

public class Student {
    private Integer id;
    private String name;
    private String email;
    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}