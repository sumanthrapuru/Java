package dsa.queue;

import java.util.Stack;

public class Queue2StackImpl {

    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public void enqueue(int item){
        enqueueStack.push(item);
    }

    public int dequeue(){
        if(enqueueStack.isEmpty() && dequeueStack.isEmpty()){
            throw new RuntimeException("queue empty");
        }
        if(dequeueStack.isEmpty()){
            while (!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }
}
