package com.ppp.list;

/**
 * @auther ppp
 * @create 2021-03-20 22:42
 */
public class list_test {

    public static void main(String[] args) {
       // ReverseList()
    }

        public static ListNode ReverseList(ListNode head) {
            if(head==null){
                return null;
            }
            ListNode pre = null;
            ListNode next = null;
            while(head!=null){
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;

        }

}

class ListNode {
    public int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

}