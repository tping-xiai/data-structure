package com.tping.queue;

public class CircularArrayQueue {

    // 队列存储放最大个数
    private int maxSize;

    // 指向队列最后一个的后一个位置
    private int rear;

    // 指向队列第一个元素
    private int front;

    private int[] array;

    public CircularArrayQueue(int size){
        maxSize = size;
        array = new int[maxSize];
    }

    // 队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }

    // 队列是否满了
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    // 添加新元素
    public void add(int val){
        if( isFull() ){
            throw new RuntimeException("queue size is max.");
        }

        array[rear] = val;
        rear = ( rear + 1 ) % maxSize;
    }

    // 获取元素
    public int get(){
        if( isEmpty() ){
            throw new RuntimeException("Queue is empty");
        }

        int val = array[front];
        front = (front + 1) % maxSize;
        return val;
    }

    // 队列有效元素个数
    public int size(){
        return ( rear + maxSize - front) % maxSize;
    }

    public void show(){
        if( isEmpty() ){
            System.out.println("Queue is empty.");
        }

        for (int i = front; i < front + size(); i++) {
            System.out.printf("array[%d]=%d\n", i % maxSize, array[i % maxSize]);
        }
    }
}
