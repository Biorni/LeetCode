class MyQueue {

    Stack<Integer> storageStack;
    Stack<Integer> retrievalStack;

    public MyQueue() {
        storageStack = new Stack<>();
        retrievalStack = new Stack<>();
    }
    
    public void push(int x) {
        storageStack.push(x);
    }
    
    public int pop() {
        peek();
        return retrievalStack.pop();
    }
    
    public int peek() {
        if(retrievalStack.isEmpty()) {
            while(!storageStack.isEmpty()) {
                retrievalStack.push(storageStack.pop());
            }  
        }

        return retrievalStack.peek();
    }
    
    public boolean empty() {
        return retrievalStack.isEmpty() && storageStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */