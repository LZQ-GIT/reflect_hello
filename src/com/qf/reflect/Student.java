package com.qf.reflect;

/**
 * @Authoer lzq
 * @DateTime 2018/11/10  14:05
 * @Version 1.0
 */
public class Student {
    private Integer id;
    private Integer classId;
    private String name;
    private String hobbies;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", classId=" + classId +
                ", name='" + name + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", age=" + age +
                '}';
    }
}
