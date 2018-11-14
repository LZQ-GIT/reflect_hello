package com.qf.reflect;

import java.lang.reflect.Field;

/**
 * @Authoer lzq
 * @DateTime 2018/11/10  9:12
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(setObjectFieldValue(new User(),11,"李郑强","123","13207036287"));
        System.out.println(setObjectFieldValue(new Student(), 11, 12, "学生一", "编程", 18));
    }
    public  static  <T> T setObjectFieldValue(T t,Object ...objects){
        Class<?> aClass = t.getClass();
        Field[] fields = aClass.getDeclaredFields();
        int i=0;
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                field.set(t,objects[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
        return t;
    }
}
