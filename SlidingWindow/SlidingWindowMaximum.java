class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> resultList = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<Integer>();
        int  l = 0;
        int i = 0;
        int r = 0;
        while(r < nums.length){
            
            while(deque.size() > 0 && nums[r] > nums[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(r);
            if(l > deque.peekFirst()){
                deque.removeFirst();
            }
            if(r+1 >= k){
                resultList.add(nums[deque.peekFirst()]);
                l++;
            }
            r++;
        }
        int[] result = new int[resultList.size()];
        for(int x = 0; x < resultList.size(); x++){
            result[x] = resultList.get(x);
        }
        return result;
    }
}
