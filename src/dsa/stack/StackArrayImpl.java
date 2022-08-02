package dsa.stack;

public class StackArrayImpl<T> {

    private T[] stack;
    private int numberOfItems;

    public StackArrayImpl() {
        this.stack = (T[]) new Object[1];
    }

    public void push(T item) {

        if (numberOfItems == this.stack.length) {
            resize(2 * this.stack.length);
        }

        this.stack[numberOfItems++] = item;
    }

    public T pop() {
        if (isEmpty()) return null;

        T itemToPop = this.stack[--numberOfItems];
        stack[numberOfItems] = null;//to avoid memory leak

        if (numberOfItems > 0 && numberOfItems == this.stack.length / 4) {
            resize(this.stack.length / 2);
        }

        return itemToPop;
    }

    public boolean isEmpty() {
        return this.numberOfItems == 0;
    }

    public int size() {
        return this.numberOfItems;
    }

    // O(n)
    private void resize(int capacity) {

        T[] stackCopy = (T[]) new Object[capacity];

        for (int i = 0; i < numberOfItems; i++) {
            stackCopy[i] = this.stack[i];
        }

        this.stack = stackCopy;
    }
}
