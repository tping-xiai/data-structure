package com.tping.stack.test;

import com.tping.stack.ArrayStack;

public class ArrayStackTest {

    public static void main(String[] args){
        ArrayStack stack = new ArrayStack(5);
        stack.push(2);
        stack.push(12);
        stack.push(16);
        stack.show();

        System.out.println("出栈：" + stack.pop());

        System.out.println("出栈：" + stack.pop());
        //stack.show();
    }

}
