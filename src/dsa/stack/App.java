package dsa.stack;

public class App {

	public static void main(String[] args) {
		
		StackLL<Integer> stack = new StackLL<>();
		
		stack.push(10);
		stack.push(3);
		
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());

	}

}
