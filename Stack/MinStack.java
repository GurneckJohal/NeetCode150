class MinStack {
    
    public Stack<Integer> stack;
    public Stack<Integer> minstack;
    
    public MinStack() {
        stack = new Stack<Integer>();
        minstack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.empty()){
            minstack.push(val);
        }
        else{
            int min = minstack.peek() < val ? minstack.peek() : val;
            minstack.push(min);
        }
        
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        return minstack.peek();
    }
}
