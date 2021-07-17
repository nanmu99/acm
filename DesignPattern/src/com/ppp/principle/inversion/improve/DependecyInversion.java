package com.ppp.principle.inversion.improve;

/**
 * @auther ppp
 * @create 2021-07-15 23:59
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeinXin());
    }
}


//定义接口
interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}



//增加微信
class WeinXin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}


class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}