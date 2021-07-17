package com.ppp.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther ppp
 * @create 2021-07-05 21:21
 */
public class Caretaker {
    //在list集合中会有很多备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    //获取到第index个Originator 的 备忘录对象(即保存状态)
    public Memento get(int index){
        return mementoList.get(index);
    }

}
