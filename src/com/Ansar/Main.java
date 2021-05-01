package com.Ansar;

import com.Ansar.SinglyLinkedList.SinglyLinkedList;
import com.Ansar.Stack.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<String> stack=new Stack<>();
        System.out.println(stack.Size());
        System.out.println(stack.empty());
        stack.push("Ansar-0");
        stack.push("Ansar-1");
        stack.push("Ansar-2");
//        stack.push("Ansar-3");
//        stack.push("Ansar-4");
//        stack.push("Ansar-5");
        System.out.println(stack.empty());
        System.out.println(stack.peek());




    }

}
