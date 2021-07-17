package com.ppp.proxy.staticproxy;

/**
 * @auther ppp
 * @create 2021-07-03 21:41
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }
}
