package bb;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(9);
		stack.push(8);
		stack.push(7);
		stack.push(6);
		stack.push(5);
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search(7));
		System.out.println(stack.search(1));
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
