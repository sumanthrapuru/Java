package balazs.dsa1.stack;

import java.util.Stack;

public class MaxItemStackProblem {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public void push(int item) {
        mainStack.push(item);
        if (mainStack.size() == 1) {
            maxStack.push(item);
            return;
        }
        if (item > maxStack.peek()) {
            maxStack.push(item);

        } else {
            maxStack.push(maxStack.peek());
        }
    }

    public int pop() {
        maxStack.pop();
        return mainStack.pop();
    }

    public int max() {
        return mainStack.peek();
    }
}
