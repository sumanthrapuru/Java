package dsa.stack;

public class App {

	public static void main(String[] args) {
		
		StackLLImpl<Integer> stack = new StackLLImpl<>();
		
		stack.push(10);
		stack.push(3);
		
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());

	}

}
