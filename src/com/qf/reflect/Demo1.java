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
        System.out.println(setObjectFieldValue(new Student(), 11, 12, "学生二", "设计", 19));
    }

    /**
     * 动态的给对象的属性赋值（参数列表需要和对象的属性顺序一致）
     * @param t
     * @param objects
     * @param <T>
     * @return
     */
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
