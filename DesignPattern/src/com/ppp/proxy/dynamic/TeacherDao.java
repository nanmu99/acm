package com.ppp.proxy.dynamic;

/**
 * @auther ppp
 * @create 2021-07-03 21:47
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
