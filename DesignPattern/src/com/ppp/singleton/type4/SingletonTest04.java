package com.ppp.singleton.type4;

/**
 * @auther ppp
 * @create 2021-06-29 20:20
 */
/*
1) 解决了线程安全问题
2) 效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行
一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
3) 结论：在实际开发中，不推荐使用这种方式
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2 ， 线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}


//懒汉式（线程安全：同步方法）
class Singleton{
    //1.本类内部创建对象实例
    private static Singleton instance;

    //2.构造器私有化
    private Singleton(){

    }
    //3.提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    public  static synchronized Singleton getInstance(){
        if (null==instance){
            instance = new Singleton();
        }
        return instance;
    }


}