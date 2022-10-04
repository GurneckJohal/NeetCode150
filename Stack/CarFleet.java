class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Integer> sortingMap = new HashMap<>();
        for(int x = 0; x < position.length; x++){
            sortingMap.put(position[x],x);
        }
        Arrays.sort(position);
        int[] oldSpeed = Arrays.copyOf(speed, speed.length);
        for(int x = 0; x < speed.length; x++){
            speed[x] = oldSpeed[sortingMap.get(position[x])];
        }
        Stack<Double> stack = new Stack<>();
        for(int i = position.length-1; i >= 0; i--){
            double arriveTime = (target - position[i]) / (double) speed[i];
            if(!stack.empty() && arriveTime > stack.peek()){
                stack.push(arriveTime);
            }
            else if(stack.empty()){
                stack.push(arriveTime);
            }
        }
        int stackSize = 0;
        while(!stack.empty()){
            stackSize++;
            stack.pop();
        }
        return stackSize;
    }
}
