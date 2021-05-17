package com.Ansar.PriorityQueueLinked;

import java.util.NoSuchElementException;

/**
 * Here we can use any kind of data type ie. Students, String , float.
 * you just have to provide Datatype in <> like PriorityQueue< Students> or SinglyList< String>
 * @param <DataType>
 */
public class PriorityQueue<DataType> {
    private Node headNode, tailNode;
    private int sizeOfList=0;
    //Constructor-------------------------------------------------------------------------------------------------------
    /**
     * This Priority Queue is implemented using Linked List
     */
    public PriorityQueue() {
        this.headNode = this.tailNode = null; //TODO: keeping both head and tail null for creating very first node
    }
    //==================================================================================================================
    //TODO:Priority Queue Using Singly Linked Lists methods-------------------------------------------------------------

    /**
     * @param priority Accepts Priority
     * @param data Accepts an element of Generic type
     *             Priority will be in integer -∞ to +∞. This will add the elements from high to low priority given in parameters.
     */
    public void enqueue(int priority, DataType data)
    {
        sizeOfList++;
        Node<DataType> currentNode=new Node<>(priority,data);
        if(headNode==null)
        {
            headNode=tailNode=currentNode;
        }
        else
        {
            tailNode.setNextLink(currentNode);
            tailNode=currentNode;
        }
        sort();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * This Private method sorts the Linked List Nodes form Highest Priority to low.
     */
    private void sort()
    {
        DataType LeftNodeData;
        int prioritySwapLeftNode;
        for(Node leftNode=headNode;leftNode!=null;leftNode=leftNode.getNextLink())
        {
            for(Node rightNode=headNode;rightNode!=null; rightNode=rightNode.getNextLink())
            {
                if(leftNode.priority>rightNode.priority)
                {

                    LeftNodeData= (DataType) leftNode.data;
                    prioritySwapLeftNode=leftNode.priority;

                    leftNode.data=rightNode.data;
                    leftNode.priority=rightNode.priority;

                    rightNode.data=LeftNodeData;
                    rightNode.priority=prioritySwapLeftNode;
                }

            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param Index Provide index from 0-to-Size();.
     *              It returns the element present in the mentioned position in the linked list.
     *              If the index mentioned in the argument is more than the size of linked list,
     *              then it returns false.
     * @return  true or false
     */
    public DataType get(int Index)
    {
        int indexCounter=0;
        Node currentNode=headNode;
        while(currentNode!=null)
        {
            if(Index==indexCounter)
            {
                return ((DataType) currentNode.data);
            }
            currentNode=currentNode.getNextLink();
            indexCounter++;
        }
        return null;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return Very first element of the Linked List.
     */
    private DataType getFirst() { return (DataType) headNode.data; }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Very Last element of Linked List.
     */
    private DataType getLast() { return (DataType) tailNode.data; }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return size of Linked List.
     */
    public int Size()
    {
        return sizeOfList;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return true if the Linked List is empty at that point else false.
     */
    public boolean isEmpty()
    {
        return (headNode==null);
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * this method removes the very first element from the list
     */
    private void removeFirst()
    {
        sizeOfList--;
        headNode=headNode.getNextLink();
        System.gc();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     *  It is used to remove all of the elements from this list.
     */
    public void clear()
    {
        for(int count=0;count<sizeOfList;count++)
        {
            headNode=headNode.getNextLink();
            System.gc();
        }
        headNode=null;
        tailNode=null;
        System.gc();
        this.sizeOfList=0;
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param data Accepts Object
     *            It is used to compare the specified object with the elements of a list.
     * @return true or false
     */
    @Override
    public boolean equals(Object data)
    {
        for(int count=0;count<sizeOfList;count++)
        {
            if(get(count).equals(data))
                return true;
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     * @return head of Queue.
     * Removes the head of the queue and returns it. Throws NoSuchElementException if queue is empty.
     */
    public DataType dequeue()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        else
        {
            DataType data=getFirst();
            removeFirst();
            return data;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Returns the head of the queue without removing it. Throws NoSuchElementException if the queue is empty.
     */
    public DataType front()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        else
            return getFirst();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @return Returns the tail of the queue without removing it. Throws NoSuchElementException if the queue is empty.
     */
    public DataType rare()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        else
            return getLast();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @param Index Provide index from 0-to-Size();.
     *              It returns the element present in the mentioned position in the linked list.
     *              If the index mentioned in the argument is more than the size of linked list,
     *              then it returns false.
     * @return  true or false
     */
    public int getPriority(int Index)
    {
        int indexCounter=0;
        Node currentNode=headNode;
        while(currentNode!=null)
        {
            if(Index==indexCounter)
            {
                return  currentNode.priority;
            }
            currentNode=currentNode.getNextLink();
            indexCounter++;
        }
        return Integer.parseInt(null);
    }
    //==================================================================================================================

}
