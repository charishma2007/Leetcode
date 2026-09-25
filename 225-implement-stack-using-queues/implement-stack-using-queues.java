class MyStack {
    Queue<Integer> d1;
    Queue<Integer> d2;
    public MyStack() {
        d1 = new ArrayDeque<>();
        d2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        d2.offer(x);
        while(!d1.isEmpty()){
            d2.offer(d1.poll());
        }
        Queue<Integer> temp = d1;
        d1 = d2;
        d2 = temp;
        
    }
    
    public int pop() {
        return d1.poll();
    }
    
    public int top() {
        return d1.peek();
    }
    
    public boolean empty() {
        return d1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */