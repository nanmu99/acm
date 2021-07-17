package com.ppp.list;

/**
 * @auther ppp
 * @create 2021-03-20 19:37
 */
public class Josepfu {

    public static void main(String[] args) {
        // 测试一把看看构建环形链表，和遍历是否 ok
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(125);// 加入 5 个小孩节点
        circleSingleLinkedList.showBoy();
        //测试一把小孩出圈是否正确
        circleSingleLinkedList.countBoy(10, 20, 125); // 2->4->1->5->3
    }

}

class CircleSingleLinkedList{
    //创建一个first节点，当前没有编号
    private Boy first = null;

    //添加小孩节点，构建成一个环形的链表
    public void addBoy(int nums){

        if (nums<1){
            System.out.println("nums 的值不正确");
            return;
        }
        Boy curBoy = null;//// 辅助指针，帮助构建环形链表
        //使用for来创建我们的环形链表
        for (int i = 1; i <=nums ; i++) {
            Boy boy = new Boy(i);
            //如果是第一个小孩
            if (i==1){
                first = boy;
                first.setNext(first);//构成环
                curBoy = first;// 让 curBoy 指向第一个小孩
            }else{
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }

        }
    }

    public void showBoy(){
        if (first==null){
            System.out.println("没有任何小孩~~");
            return;
        }

        Boy curBoy = first;
        while (true)
        {
            System.out.printf("小孩的编号 %d \n", curBoy.getNo());
            if (curBoy.getNext()==first){// 说明已经遍历完毕
                break;
            }
            curBoy = curBoy.getNext();
        }
    }

    public void countBoy(int startNo,int countNum,int nums){
        if (first == null||startNo<1||startNo>nums){
            System.out.println("参数输入有误， 请重新输入");
            return;
        }
        Boy curBoy = first;
        while (true){
            if (curBoy.getNext()==first){// 说明 helper 指向最后小孩节点
                break;
            }
            curBoy = curBoy.getNext();
        }

        //小孩报数前，先让 first 和 helper 移动 k - 1 次
        for (int i = 0; i <startNo-1 ; i++) {
            first = first.getNext();
            curBoy = curBoy.getNext();
        }

        //当小孩报数时，让 first 和 helper 指针同时 的移动 m - 1 次, 然后出圈
        //这里是一个循环操作，知道圈中只有一个节点
        while (true){
            //说明圈中只有一个节点
            if (curBoy==first){
                break;
            }
            //让 first 和 helper 指针同时 的移动 countNum - 1
            for (int i = 0; i < countNum-1 ; i++) {
                first = first.getNext();
                curBoy = curBoy.getNext();
            }
            //这时 first 指向的节点，就是要出圈的小孩节点
            System.out.printf("小孩%d 出圈\n", first.getNo());
            //这时将 first 指向的小孩节点出圈
            first = first.getNext();
            curBoy.setNext(first);
        }
        System.out.printf("最后留在圈中的小孩编号%d \n", first.getNo());


    }
}


class Boy{
    private int no;//编号
    private Boy next;//// 指向下一个节点,默认 null

    public Boy() {
    }

    public Boy(int no) {
        this.no = no;
    }

    public Boy(int no, Boy next) {
        this.no = no;
        this.next = next;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "no=" + no +
                ", next=" + next +
                '}';
    }
}
