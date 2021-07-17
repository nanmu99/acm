package com.ppp.proxy.staticproxy;

/**
 * @auther ppp
 * @create 2021-07-03 21:44
 */
public class Client {
    public static void main(String[] args) {

        //创建目标对象(被代理对象)
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
