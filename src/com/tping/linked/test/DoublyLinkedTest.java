package com.tping.linked;

public class DoublyLinkedTest {

    public static void main(String[] args){

        DoublyLinked linked = new DoublyLinked();

        linked.add(10, 0);
        linked.add(20, 1);
        linked.add(30, 2);

        linked.show();
    }
}
