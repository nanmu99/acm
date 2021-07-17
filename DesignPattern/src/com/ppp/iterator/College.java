package com.ppp.iterator;

import java.util.Iterator;

/**
 * @auther ppp
 * @create 2021-07-03 22:48
 */
public interface College {
    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器，遍历
    public Iterator createIterator();
}
