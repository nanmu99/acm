package com.ppp.singleton.type1;

/**
 * @auther ppp
 * @create 2021-06-29 20:00
 */

/*
1) 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
2) 缺点：在类装载的时候就完成实例化，没有达到 Lazy Loading 的效果。如果从始至终从未使用过这个实例，则
会造成内存的浪费
3) 这种方式基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，在单例模式中大
多数都是调用 getInstance 方法，但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静
态方法）导致类装载，这时候初始化 instance 就没有达到 lazy loading 的效果
4) 结论：这种单例模式可用，可能造成内存浪费
 */
public class SingletonTest01{
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2=  Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1.hashcode"+instance1.hashCode());
        System.out.println("instance2.hashcode"+instance2.hashCode());
    }
}


//饿汉式(静态变量)
class Singleton{
    //1.构造器私有化，外部能new
    private Singleton(){

    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}

















