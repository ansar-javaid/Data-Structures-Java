package com.Ansar.DoublyLinkedList;

/**
 * Here we can use any kind of data type ie. Students, String , Integer.
 * you just have to provide Datatype in <> like Node< Students> or Node< String>
 * @param <anyDataType>
 */
 class Node<anyDataType> {
    public anyDataType data; // we can use any kind of data type using generics ie. Students, String.
    private Node nextLink; // Node here is the same object of this Node class. we have make same object of class Node as nextLink
    private Node previousLink; // Node here is the same object of this Node class. we have make same object of class Node as nextLink
    //Constructor-------------------------------------------------------------------------------------------------------
    protected Node(anyDataType data) {
        this.data = data;
        this.nextLink = this.previousLink = null;
    }
    //Getters-----------------------------------------------------------------------------------------------------------
    protected Node getNextLink() { return nextLink; }
    protected Node getPreviousLink() { return previousLink; }
    //Setters-----------------------------------------------------------------------------------------------------------
    protected void setNextLink(Node nextLink) { this.nextLink = nextLink; }
    protected void setPreviousLink(Node previousLink) { this.previousLink = previousLink; }
    //==================================================================================================================
}
