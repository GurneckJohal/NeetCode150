class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indexStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        int[] result = new int[temperatures.length];
        indexStack.push(0);
        tempStack.push(temperatures[0]);
        for(int x = 1; x < temperatures.length; x++){
            while(!tempStack.empty() && temperatures[x] > tempStack.peek()){
                int originalDayIndex = indexStack.pop();
                result[originalDayIndex] = x - originalDayIndex;
                tempStack.pop();
            }
            indexStack.push(x);
            tempStack.push(temperatures[x]);
        }
        return result;
    }
}
