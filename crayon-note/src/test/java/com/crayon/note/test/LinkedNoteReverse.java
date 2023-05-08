package com.crayon.note.test;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

public class LinkedNoteReverse {
    @Test
    public void linkedNoteReverse() {
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, node1);
        Node node3 = new Node(3, node2);
        Node node4 = new Node(4, node3);
        Node node5 = new Node(5, node4);
        Node tmp = node5;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
        Node reverse = reverse(node5);
        System.out.println("=======================");
        while (reverse != null) {
            System.out.println(reverse.val);
            reverse = reverse.next;
        }

    }

    public static Node reverse(Node head) {  // 原链表3→2→1→null,反转后链表1→2→3→null
        Node pre = null;   //定义一个链表，指向空，存储每次反转后的结果链表。
        Node next;    // 定义一个链表，存储链表指针反转后切断的未处理链表
        while (head != null) {  //控制条件为head为null终止，每次循环head头结点会被处理掉，知道处理完最后一个节点，指向空
            next = head.next;  // 用next节点存储原链表第二个节点到最后节点组成的链表，第一次循环next = 2→1→null
            head.next = pre;// head指向处理完成的节点。第一次循环head = 3→null
            pre = head;  // 将head节点交给pre节点存储，方便head赋值进行下次循环。
            head = next;  // 将循环体第一行保存的第二个节点到最后节点组成的链表赋值给head进行下次循环。
        }
        return pre;
    }
    /*
     * 3→2→1→null
     * 第一次循环：
     * next = 2→1→null
     * pre = 3→null
     * head = 2→1→null
     * 第二次循环：
     * next = 1→null
     * pre = 2→3→null
     * head = 1→null
     * 第三次循环：
     * next = null；
     * pre = 1→2→3→null
     * head = null
     * 结束
     * */

}


class Node {
    public int val;
    public Node next;

    public Node(int val, Node node) {
        this.val = val;
        this.next = node;

    }

    //    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                for (int k = 0; k < 10; k++) {
//                    System.out.println("i:" + i + "   j:" + j + "   k:" + k);
//                    if (k == 5)
//                        throw new Exception("finish");
//                }
//            }
//        }
//        System.out.println("end");
//    }
    public static void main(String[] args) {
        BigDecimal amt1 = BigDecimal.valueOf(10);
        BigDecimal amt2 = BigDecimal.valueOf(3);
        System.out.println(amt1.divide(amt2));
        /*
         *
         * */
        String str = new String("yaojikai ");
        System.out.println("===" + str + "===");
    }

}
