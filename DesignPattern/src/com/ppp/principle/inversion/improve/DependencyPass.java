package com.ppp.principle.inversion.improve;

/**
 * @auther ppp
 * @create 2021-07-16 0:05
 */
public class DependencyPass {
    public static void main(String[] args) {
          //方式1： 通过接口传递实现依赖
        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);
        // 方式2: 通过构造方法依赖传递
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();
        // 方式3 , 通过setter方法传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();


    }
}

//方式1： 通过接口传递实现依赖
//开关的接口
//interface IOpenAndClose{
//    public void open(ITV tv);//抽象方法,接收接口
//}
//
//interface ITV{
//    public void play();
//}
//
class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}
//
//class OpenAndClose implements IOpenAndClose{
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}


// 方式2: 通过构造方法依赖传递
//interface  IOpenAndClose{
//    public void open();//抽象方法
//}
//
//interface ITV{//ITV接口
//    public void play();
//
//}
//
//class OpenAndClose implements IOpenAndClose{
//
//    public ITV iTv;
//
//    public OpenAndClose(ITV iTv) {
//        this.iTv = iTv;
//    }
//
//    @Override
//    public void open() {
//        this.iTv.play();
//    }
//}



// 方式3 , 通过setter方法传递
interface ITV{// ITV接口
    public void play();
}

interface IOpenAndClose{
    public void open();
    public void setTv(ITV tv);
}

class OpenAndClose implements IOpenAndClose{
    private ITV tv;

    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}


