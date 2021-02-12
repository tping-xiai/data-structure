package com.tping.stack;

/**
 * 栈：数组模拟
 * @author zhuwj
 */
public class ArrayStack  {

    // 表示栈顶位置
    private int top;
    // 栈的大小
    private int size;

    private int[] stack;

    public ArrayStack(int size){
        this.top = -1;
        this.size = size;
        stack = new int[size];
    }

    public boolean push(int val){
        if( isFull() ) return false;
        top++;
        stack[top] = val;
        return true;
    }

    public int pop(){
        if( isEmpty() ) return -1;
        int val = stack[top];
        top--;
        return val;
    }

    public void show(){
        if( isEmpty() )return;
        for (int i = 0; i <= top; i++) {
            System.out.printf("stack[%d]=%d\n",i ,stack[i]);
        }
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
