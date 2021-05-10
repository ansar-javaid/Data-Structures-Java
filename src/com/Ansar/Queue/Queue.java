package com.Ansar.Queue;

import com.Ansar.SinglyLinkedList.SinglyLinkedList;
import com.Ansar.Stack.Stack;

import java.util.NoSuchElementException;

/**
 * Queue: First In First Out -FIFO .
 * Here we can use any kind of data type ie. Students, String , Integer.
 * you just have to provide Datatype in <> like Queue< Students> or Node< String>
 * @param <DataType>
 */
public class Queue<DataType>{
    private SinglyLinkedList<DataType> queueList=new SinglyLinkedList<>();
    //Constructor-------------------------------------------------------------------------------------------------------
    public Queue() {
    }
    //TODO: Queue Methods using Singly Linked List----------------------------------------------------------------------
    /**
     * @return  true if the Queue is empty, and returns false if the stack contains elements.
     */
    public int Size()
    {
        return queueList.Size();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param data  Inserts the specified element into the queue.
     */
    public void enqueue(DataType data)
    {
        queueList.add(data);
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return head of Queue.
     * Removes the head of the queue and returns it. Throws NoSuchElementException if queue is empty.
     */
    public DataType dequeue()
    {
        if(queueList.isEmpty())
            throw new NoSuchElementException();
        else
        {
            DataType data=queueList.getFirst();
            queueList.removeFirst();
            return data;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Returns the head of the queue without removing it. Throws NoSuchElementException if the queue is empty.
     */
    public DataType front()
    {
        if(queueList.isEmpty())
            throw new NoSuchElementException();
        else
            return queueList.getFirst();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Returns the tail of the queue without removing it. Throws NoSuchElementException if the queue is empty.
     */
    public DataType rare()
    {
        if(queueList.isEmpty())
            throw new NoSuchElementException();
        else
            return queueList.getLast();
    }
    //=================================================================================================================

}
