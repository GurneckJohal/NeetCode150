class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.empty()){
                switch(ch){
                    case ')':
                        if(stack.peek() == '('){
                            stack.pop();
                        }
                        else{
                            stack.push(ch);
                        }
                        break;
                    
                    case '}':
                        if(stack.peek() == '{'){
                            stack.pop();
                        }
                        else{
                            stack.push(ch);
                        }
                        break;
                        
                    case ']':
                        if(stack.peek() == '['){
                            stack.pop();
                        }
                        else{
                            stack.push(ch);
                        }
                        break;
                        
                    case default:
                        stack.push(ch);
                        break;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.empty();
    }
}
