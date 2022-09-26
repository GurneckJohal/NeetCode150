class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        HashSet<String> hs = new HashSet<>();
        hs.add("+");
        hs.add("-");
        hs.add("*");
        hs.add("/");
        for(int x = 0; x < tokens.length; x++){
            if(hs.contains(tokens[x])){
                int right = Integer.parseInt(stack.pop());
                int left = Integer.parseInt(stack.pop());
                switch(tokens[x]){
                    case "+":
                        stack.push(Integer.toString(left + right));
                        break;
                    case "-":
                        stack.push(Integer.toString(left - right));
                        break;
                    case "*":
                        stack.push(Integer.toString(left * right));
                        break;
                    case "/":
                        stack.push(Integer.toString(left / right));
                        break;
                    default:
                        
                }
            }
            else{
                stack.push(tokens[x]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
