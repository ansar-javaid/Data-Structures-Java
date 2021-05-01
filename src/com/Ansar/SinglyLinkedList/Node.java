package com.Ansar.SinglyLinkedList;

/**
 * Here we can use any kind of data type ie. Students, String , Integer.
 * you just have to provide Datatype in <> like Node< Students> or Node< String>
 * @param <anyDataType>
 */
class Node<DataType> {
    public DataType data; // we can use any kind of data type using generics ie. Students, String.
    private Node nextLink; // Node here is the same object of this Node class. we have make same object of class Node as nextLink
    //Constructor-------------------------------------------------------------------------------------------------------
    protected Node(DataType data) {
        this.data = data;
        this.nextLink = null;
    }
    //Getter------------------------------------------------------------------------------------------------------------
    protected Node getNextLink() { return nextLink; }
    //Setter------------------------------------------------------------------------------------------------------------
    protected void setNextLink(Node nextLink) { this.nextLink = nextLink; }
    //==================================================================================================================

}
