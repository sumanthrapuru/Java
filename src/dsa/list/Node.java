package dsa.list;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> nextNode;
    private Node<T> prevNode;


    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
