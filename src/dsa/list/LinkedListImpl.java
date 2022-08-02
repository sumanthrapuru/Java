package dsa.list;

public class LinkedListImpl<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private int numOfItems;

    @Override
    public void insert(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            insertBeginning(data);
        }
    }

    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    private void insertEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            node.setNextNode(new Node<>(data));
        }
    }

    @Override
    public void remove(T data) {
        if (head == null) return;
        if (head.getData().compareTo(data) == 0) {
            head = head.getNextNode();
        } else {
            remove(data, head, head.getNextNode());
        }
    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
        while (actualNode != null) {
            if (actualNode.getData().compareTo(data) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverse() {
        if (head == null) return;

        Node<T> actualNode = head;

		while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return numOfItems;
    }

    public Node<T> getMiddleNode() {

        Node<T> slow = this.head;
        Node<T> fast = this.head;

        while (fast.getNextNode() != null && fast.getNextNode().getNextNode() != null) {
            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode();
        }
        return slow;
    }

    public void reverse() {
        Node<T> current = this.head;
        Node<T> prev = null, next = null;

        while (current != null) {
            next = current.getNextNode();
            current.setNextNode(prev);
            prev = current;
            current = next;
        }

        this.head = prev;

    }

}
