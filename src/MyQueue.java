import java.util.Deque;
import java.util.LinkedList;

class MyQueue {
	Deque<Integer> stack = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	int length;
    	int a;
    	stack.addLast(x);
    	length = stack.size();
    	for(int i=0;i<length-1;i++) {
    		a=stack.pollFirst();
    		stack.addLast(a);
    	}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	return stack.pollLast();
    }
    
    /** Get the front element. */
    public int peek() {
    	return stack.peekLast();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return stack.isEmpty();
    }
}
