package balazs.dsa1.stack;

public class StackLLImpl<T extends Comparable<T>> {

    private Node<T> root;
    private int count;

    public void push(T newData) {

        this.count++;

        if (this.root == null) {
            this.root = new Node<>(newData);
        } else {
            Node<T> oldRoot = this.root;
            this.root = new Node<>(newData);
            this.root.setNextNode(oldRoot);
        }
    }

    public int size() {
        return this.count;
    }

    public T pop() {
        T itemToPop = this.root.getData();
        this.root = this.root.getNextNode();
        this.count--;
        return itemToPop;
    }

    public boolean isEmpty() {
        return this.root == null;
    }
}
