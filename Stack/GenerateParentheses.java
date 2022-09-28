class Solution {
    
    LinkedList<String> result;
    
    public List<String> generateParenthesis(int n) {
        result = new LinkedList<>();
        buildCombo(n,"",0,0);
        return result;
    }
    
    public void buildCombo(int n, String combo, int openCount, int closedCount){
        if(openCount == n && closedCount == openCount){
            result.add(combo);
            return;
        }
        
        if(openCount < n){
            buildCombo(n,combo + "(",openCount + 1, closedCount);
        }
        
        if(closedCount < openCount){
            buildCombo(n,combo + ")", openCount, closedCount + 1);
        }
    }
}
