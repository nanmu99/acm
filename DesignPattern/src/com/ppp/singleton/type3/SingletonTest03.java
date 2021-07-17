package com.ppp.singleton.type3;

/**
 * @auther ppp
 * @create 2021-06-29 20:15
 */

/*
1) 起到了 Lazy Loading 的效果，但是只能在单线程下使用。
2) 如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过
了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
3) 结论：在实际开发中，不要使用这种方式.
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1 ， 线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton{
    //1.构造器私有化，外部能new
    private Singleton(){

    }

    //2.本类内部创建实例
    private static Singleton instance;

    ///3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }

        return instance;
    }

}