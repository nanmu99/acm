package com.ppp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther ppp
 * @create 2021-07-01 20:00
 */
//University 就是 Composite , 可以管理College
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    // 构造器
    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public String getDes() {
        return super.getDes();
    }



    // print方法，就是输出University 包含的学院
    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
        for(OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }
}
