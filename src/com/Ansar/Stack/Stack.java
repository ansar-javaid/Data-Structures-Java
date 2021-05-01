package com.Ansar.Stack;

import com.Ansar.SinglyLinkedList.SinglyLinkedList;

/**
 * Here we can use any kind of data type ie. Students, String , Integer.
 * you just have to provide Datatype in <> like Stack< Students> or Node< String>
 * @param <DataType>
 */
public class Stack<DataType> {
    private SinglyLinkedList<DataType> stackList=new SinglyLinkedList<>();
    private DataType data;
    private int sizeOFStack=0;
    //Constructor-------------------------------------------------------------------------------------------------------
    public Stack() { }
    //TODO: Stack Methods using Singly Linked List----------------------------------------------------------------------
    /**
     * @param data Pushes the element onto the stack.
     */
    public void push(DataType data)
    {
        stackList.add(data);
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return Object
     * Returns the element on the top of the stack, removing it in the process.
     */
    public DataType pop()
    {
        if(stackList.isEmpty())
        {
            System.out.println("Stack Underflow");
            return null;
        }
        else
        {
            DataType LastPopped=stackList.get(stackList.Size()-1);
            stackList.remove(stackList.Size()-1);
            return LastPopped;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return the size of Stack or elements that  are present in Stack.
     */
    public int Size()
    {
        return stackList.Size();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return  true if the stack is empty, and returns false if the stack contains elements.
     */
    public boolean empty()
    {
        return (stackList.isEmpty());
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Returns the element on the top of the stack, but does not remove it.
     */
    public DataType peek()
    {
        return stackList.getLast();
    }
    //==================================================================================================================
}
