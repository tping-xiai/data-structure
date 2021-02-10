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

    static class LinkedNode{
        public int id;
        public int val;
        public LinkedNode next;

        public LinkedNode(int id, int val){
            this.id = id;
            this.val = val;
        }
    }
}
