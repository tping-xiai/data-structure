package com.tping.linked.test;

import com.tping.linked.SingleLinked;

import java.util.LinkedList;

public class SingleLinkedTest {

    public static void main(String[] args){

        SingleLinked linked = new SingleLinked();
        linked.add(new SingleLinked.LinkedNode(10, 200));
        linked.add(new SingleLinked.LinkedNode(13, 500));
        linked.add(new SingleLinked.LinkedNode(11, 300));
        linked.add(new SingleLinked.LinkedNode(12, 400));
        linked.show();

//        linked.update(new SingleLinked.LinkedNode(11, 330));
//        System.out.println("============修改后链表===========");
//        linked.show();

        //linked.del(10);
        //System.out.println("============删除后链表===========");
        //linked.show();
        //linked.del(13);
        //System.out.println("============删除后链表===========");
        //linked.show();
        //linked.del(11);
        //linked.del(12);

        System.out.println("size: " + linked.size(linked.getHead()));

         linked.reverse(linked.getHead());
        System.out.println("============反转后链表===========");
        linked.show();


        LinkedList linkedList = null;

        System.out.println(1 >> 1);
        System.out.println(5 >> 1);
    }

}
