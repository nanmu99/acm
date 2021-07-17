package com.ppp.java2;

import com.ppp.java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @auther ppp
 * @create 2021-06-27 19:26
 */
public class OtherTest {
    /**
     * 获取构造器结构
     */

    @Test
    public void test1(){
        Class clazz = Person.class;
        ////getConstructors():获取当前运行时类中声明为public的构造器
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c:constructors){
            System.out.println(c);
        }

        System.out.println();
        //getConstructors():获取当前运行时类中声明为public的构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c:declaredConstructors){
            System.out.println(c);
        }
    }

    /**
     * 获取运行时类的父类
     *
     */
    @Test
    public void test2(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

     /*
    获取运行时类的带泛型的父类

     */
     @Test
     public void test3(){
         Class clazz =Person.class;
         Type genericSuperclass = clazz.getGenericSuperclass();
         System.out.println(genericSuperclass);
     }

      /*
    获取运行时类的带泛型的父类的泛型


    代码：逻辑性代码  vs 功能性代码
     */
      @Test
      public void test4(){
          Class clazz=Person.class;
          Type genericSuperclass = clazz.getGenericSuperclass();
          ParameterizedType paramType = (ParameterizedType) genericSuperclass;
          Type[] actualTypeArguments = paramType.getActualTypeArguments();
          System.out.println(actualTypeArguments[0].getTypeName());
      }

      @Test
      public void test5(){
          Class clazz = Person.class;
          Class[] interfaces = clazz.getInterfaces();
          for (Class c:interfaces){
              System.out.println(c);
          }
          System.out.println();

          //获取运行时类的父类实现的接口
          Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
          for(Class c:interfaces1){
              System.out.println(c);
          }
      }

      /*
        获取运行时类所在的包

     */
      @Test
    public void test06(){
          Class clazz = Person.class;
          Package pack = clazz.getPackage();
          System.out.println(pack);
      }

       /*
        获取运行时类声明的注解

     */

       @Test
        public void test7(){
           Class clazz = Person.class;
           Annotation[] annotations = clazz.getAnnotations();
           for(Annotation annos : annotations){
               System.out.println(annos);
           }
       }







}
