package com.ppp.list;

/**
 * @auther ppp
 * @create 2021-03-18 11:34
 */
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        // 测试
        System.out.println("双向链表的测试");
        // 先创建节点
        HeroNodee2 hero1 = new HeroNodee2(1, "宋江", "及时雨");
        HeroNodee2 hero2 = new HeroNodee2(2, "卢俊义", "玉麒麟");
        HeroNodee2 hero3 = new HeroNodee2(3, "吴用", "智多星");
        HeroNodee2 hero4 = new HeroNodee2(4, "林冲", "豹子头");
        // 创建一个双向链表
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(hero1);
        doubleLinkedList.add(hero2);
        doubleLinkedList.add(hero3);
        doubleLinkedList.add(hero4);
        doubleLinkedList.list();
// 修改
        HeroNodee2 newHeroNode = new HeroNodee2(4, "公孙胜", "入云龙");
        doubleLinkedList.update(newHeroNode);
        System.out.println("修改后的链表情况");
        doubleLinkedList.list();
// 删除
        doubleLinkedList.del(3);
        System.out.println("删除后的链表情况~~");
        doubleLinkedList.list();
    }
}


class DoubleLinkedList{

    private HeroNodee2 head = new HeroNodee2(0,"","");
    public HeroNodee2 getHead(){
        return head;
    }

    public void list(){
        // 判断链表是否为空
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        // 因为头节点，不能动，因此我们需要一个辅助变量来遍历
        HeroNodee2 temp = head.next;
        while (true){
            if (temp==null){
                break;
            }
            // 输出节点的信息
            System.out.println(temp);
            // 将 temp 后移， 一定小心
            temp = temp.next;
        }

    }

    //添加节点到单向链表
    //思路，当不考虑编号顺序时
    //1. 找到当前链表的最后节点
    //2. 将最后这个节点的next 指向 新的节点
    public void add(HeroNodee2 note){
        HeroNodee2 temp = head;
        while(true){
            if (temp.next==null){
                break;
            }
            // 如果没有找到最后, 将将 temp 后移
            temp = temp.next;
        }

        temp.next = note;
        note.pre = temp;

    }

    // 修改一个节点的内容, 可以看到双向链表的节点内容修改和单向链表一样
    // 只是 节点类型改成 HeroNode2
    public void update(HeroNodee2 newHeroNode){
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNodee2 temp = head.next;
        Boolean flag = false;
        while (true){
            if (temp==null){
                break;// 已经遍历完链表
            }
            if (temp.no==newHeroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.name;
        }else{
            System.out.printf("没有找到 编号 %d 的节点，不能修改\n", newHeroNode.no);
        }

    }

    // 从双向链表中删除一个节点, // 说明
    // 1 对于双向链表，我们可以直接找到要删除的这个节点
    // 2 找到后，自我删除即可

    public void del(int no){
        // 判断当前链表是否为空
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNodee2 temp = head.next;// 辅助变量(指针)
        Boolean flag = false;// 标志是否找到待删除节点的
        while (true){
            if (temp==null){
                break;
            }
            if (temp.no==no){
                // 找到的待删除节点的前一个节点 temp
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.pre.next = temp.next;
            // 如果是最后一个节点，就不需要执行下面这句话，否则出现空指针
            if (temp.next!=null){
                temp.next.pre = temp.pre;
            }
        }
        else {
            System.out.printf("要删除的 %d 节点不存在\n", no);
        }

    }


}


// 定义 HeroNode2 ， 每个 HeroNode 对象就是一个节点
class HeroNodee2{
    public int no;
    public String name;
    public String nickname;
    public HeroNodee2 next;// 指向下一个节点, 默认为 null
    public HeroNodee2 pre;// 指向前一个节点, 默认为 null

    public HeroNodee2() {
    }

    public HeroNodee2(int no, String name, String nickname) {
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
        return "HeroNodee2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}