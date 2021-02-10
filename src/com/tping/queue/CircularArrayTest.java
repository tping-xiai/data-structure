package com.tping.queue;

public class CircularArrayTest {

    public static void main(String[] args){
        System.out.println("===================>使用数组模拟队列<=====================");

        CircularArrayQueue queue = new CircularArrayQueue(5);

        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.show();
        try {
            queue.add(14);// 抛异常队列满了
        } catch (Exception e) {
            System.out.println("队列满了哦~~");
        }

        queue.get();
        queue.show();
        System.out.println("第一次获取后队列中元素");
        queue.get();
        queue.show();
        System.out.println("第二次获取后队列中元素");
        queue.get();
        queue.show();
        System.out.println("第三次获取后队列中元素");


        System.out.println("重新在队列中添加元素：");
        queue.add(21);
        queue.add(22);
        queue.show();
    }

}
