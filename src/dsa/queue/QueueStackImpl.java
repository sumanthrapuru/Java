package dsa.queue;

import java.util.Stack;

public class QueueStackImpl {
    private Stack<Integer> stack = new Stack<>();

    void enqueue(int item){
        stack.push(item);
    }

    public int dequeue(){
        if(stack.size() == 1) return stack.pop();

        int item = stack.pop();
        int lastDequeuedItem = dequeue();
        enqueue(item);
        return lastDequeuedItem;
    }
}
