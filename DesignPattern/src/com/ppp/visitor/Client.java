package com.ppp.visitor;

/**
 * @auther ppp
 * @create 2021-07-03 22:43
 */
public class Client {
    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //成功
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("===============");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("=======给的是待定的测评========");

        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
