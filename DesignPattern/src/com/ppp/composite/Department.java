package com.ppp.composite;

/**
 * @auther ppp
 * @create 2021-07-01 20:07
 */
public class Department extends OrganizationComponent {

    //没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    //add , remove 就不用写了，因为他是叶子节点


    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
