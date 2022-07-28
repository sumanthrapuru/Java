package dsa.list;

public class DoublyLinkedListImpl<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> tail;

    public void insert(T data){
        Node<T> newNode = new Node<>(data);

        if(tail == null){
            tail = newNode;
            head = newNode;
        } else {
            newNode.setPrevNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }
}
