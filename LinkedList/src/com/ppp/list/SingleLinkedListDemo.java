package com.ppp.list;

import java.util.Stack;

/**
 * @auther ppp
 * @create 2021-03-17 10:29
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        //进行测试
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //加入
        // singleLinkedList.add(hero1);
        // singleLinkedList.add(hero4);
        // singleLinkedList.add(hero2);
        // singleLinkedList.add(hero3);
        //加入按照编号的顺序
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);
        //显示一把
        singleLinkedList.list();
        //HeroNode node = findLastIndexNode(singleLinkedList.getHead(), 2);
//        System.out.println(node);
        //测试修改节点的代码
        //reversetList();
//        HeroNode newHeroNode = new HeroNode(2, "小卢", "玉麒麟~~");
//        singleLinkedList.update(newHeroNode);
//        System.out.println("修改后的链表情况~~");
//        singleLinkedList.list();
//        //删除一个节点
//        singleLinkedList.delete(1);
//        singleLinkedList.delete(4);
//        System.out.println("删除后的链表情况~~");
//        singleLinkedList.list();
    }

    public static  int getLength(HeroNode head){
        if (head.next==null){
            return 0;
        }
        int length = 0;
        //定义一个辅助的变量, 这里我们没有统计头节点
        HeroNode cur = head.next;
        while (cur!=null){
            length++;
            cur =cur.next;//遍历
        }
        return length;
    }

    //思路
//1. 编写一个方法，接收 head 节点，同时接收一个 index
//2. index 表示是倒数第 index 个节点
//3. 先把链表从头到尾遍历，得到链表的总的长度 getLength
//4. 得到 size 后，我们从链表的第一个开始遍历 (size-index)个，就可以得到
//5. 如果找到了，则返回该节点，否则返回 nulll
    public static  HeroNode findLastIndexNode(HeroNode head, int index){
        if (head.next==null){
            return  null;
        }
        //第一个遍历得到链表的长度(节点个数)
        int  size = getLength(head);
        //第二次遍历 size-index 位置，就是我们倒数的第 K 个节点
        //先做一个 index 的校验
        if (index >size || index < 0){
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i <size-index ; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public static void reversetList(HeroNode head){
        if (head.next==null|| head.next.next==null){
            return;
        }
        HeroNode reverseHead = new HeroNode(0,"","");
        HeroNode next = null;
        HeroNode cur = head.next;
        while (cur!=null){
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        //将 head.next 指向 reverseHead.next , 实现单链表的反转
        head.next = reverseHead.next;
    }


    //方式 2：
//可以利用栈这个数据结构，将各个节点压入到栈中，然后利用栈的先进后出的特点，就实现了逆序打印的效
    public static void reversePrint(HeroNode head){
        if (head.next==null){
            return;
        }
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode cur = head.next;
        while (cur!=null){
            stack.push(cur);
            cur = cur.next;//cur 后移，这样就可以压入下一个节点
        }

        while (stack.size()>0){
            System.out.println(stack.pop());
        }

    }

}




//定义SingleLinkedList管理我们的英雄
class SingleLinkedList{
    //先初始化一个头节点，头结点不要动，不存放具体的数据
    private HeroNode head = new HeroNode(0,"","");
    //返回头节点
    public HeroNode getHead() {
        return head;
    }
    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while (true){
            //找到链表的最后
            if (temp.next==null){
                break;
            }
            //如果没有找到最后, 将将 temp 后移
           temp = temp.next;

        }
        //当退出 while 循环时，temp 就指向了链表的最后
        //将最后这个节点的 next 指向 新的节点
        temp.next = heroNode;

    }

    //第二种方式在添加英雄时，根据排名将英雄插入到指定位置
    //(如果有这个排名，则添加失败，并给出提示)
    public void addByOrder(HeroNode heroNode){
        HeroNode temp = head;
        Boolean flag = false;// flag 标志添加的编号是否存在，默认为 false

        while (true){
            if (temp.next==null){//说明 temp 已经在链表的最后
                break;
            }
            if (temp.next.no>heroNode.no){
                break;
            }else if(temp.next.no==heroNode.no){//说明希望添加的 heroNode 的编号已然存在
                //说明编号存在
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            System.out.printf("准备插入的英雄的编号 %d 已经存在了, 不能加入\n", heroNode.no);
        }else{
            //插入到链表中, temp 的后面
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    //修改节点的信息, 根据 no 编号来修改，即 no 编号不能改. //说明
    //1. 根据 newHeroNode 的 no 来修改即可
    public void update(HeroNode newHeroNode){
        HeroNode temp = head.next;
        Boolean flag = false;
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        while (true){
            if (temp==null){
                break;
            }
            if (temp.no==newHeroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        }else { //没有找到
            System.out.printf("没有找到 编号 %d 的节点，不能修改\n", newHeroNode.no);
        }

    }

    //删除节点
    //思路
    //1. head 不能动，因此我们需要一个 temp 辅助节点找到待删除节点的前一个节点
    //2. 说明我们在比较时，是 temp.next.no 和 需要删除的节点的 no 比较

    public void delete(int no){
        HeroNode temp = head;
        Boolean flag = false;
        while (true)
        {
            if (temp.next==null){
                break;
            }
            if (temp.next.no==no){
                flag = true;
                break;
            }
            temp = temp.next;//temp 后移，遍历
        }
        if (flag){
            temp.next = temp.next.next;
        }else{
            System.out.printf("要删除的 %d 节点不存在\n", no);
        }

    }
    //实现链表
    public void list(){
        //判断链表是否为空
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        //因为头节点，不能动，因此我们需要一个辅助变量来遍历
        HeroNode temp = head.next;

        while(true){
            //判断是否到链表最后
            if (temp==null){
                break;
            }
            //输出节点的信息
            System.out.println(temp);
            //将 temp 后移， 一定小心
            temp = temp.next;

        }
    }







}



class HeroNode{

    public int no;
    public String name;
    public String nickname;
    public HeroNode next;//指向下一个节点

    public HeroNode() {

    }

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}