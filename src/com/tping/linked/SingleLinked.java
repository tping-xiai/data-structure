package com.tping.linked;

public class SingleLinked {

    private LinkedNode head;

    public SingleLinked(){
        head = new LinkedNode(0, 0);
    }

    // 添加节点元素
    public void add(LinkedNode node){
        LinkedNode temp = head;
        for (;;){
            if( temp.next == null ){
                break;
            }
            temp = temp.next;
        }

        temp.next = node;
    }

    // 修改节点元素
    public void update(LinkedNode node){
        LinkedNode temp = head.next;
        for (;;){
            if( temp == null ){
                break;
            }

            if( temp.id == node.id ){
                temp.val = node.val;
                break;
            }

            temp = temp.next;
        }
    }

    public void del(int id){
        LinkedNode temp = head;
        for (;;){
            if( temp.next == null ) break;

            if( temp.next.id == id){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    // 遍历链表数据
    public void show(){
        LinkedNode temp = head.next;
        for (;;){
            if( temp == null ){
                break;
            }

            System.out.println("[id = " + temp.id + ", val = " + temp.val + "]");
            temp = temp.next;
        }
    }

    // 链表反转
    public void reverse(LinkedNode head){
        // 如果链表为空，或者链表有效长度为1，则不反转链表
        if( head.next == null || size(head) == 1 ) return;

        LinkedNode reverseNode = new LinkedNode(0, 0);
        LinkedNode temp = head.next;
        LinkedNode next = null;
        for (;temp != null;){
            // 记录当前节点的下一个节点
            next = temp.next;
            // 将新链表的下一个节点赋值给当前节点的下一个节点
            temp.next = reverseNode.next;
            // 将当前节点赋值给新链表的下一个节点
            reverseNode.next = temp;
            // 当前节点指向原链表的下一节点
            temp = next;
        }

        head.next = reverseNode.next;
    }

    // 链表头
    public LinkedNode getHead(){
        return this.head;
    }

    // 链表有效长度
    public int size(LinkedNode head){
        if( head.next == null ) return 0;

        int length = 0;
        LinkedNode temp = head;
        for (;temp.next != null;){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static class LinkedNode{
        public int id;
        public int val;
        public LinkedNode next;

        public LinkedNode(int id, int val){
            this.id = id;
            this.val = val;
        }
    }
}
