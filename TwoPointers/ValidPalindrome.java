class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);
        char[] str = s.toCharArray();
        int i1 = 0;
        int i2 = str.length - 1;
        while(i1 < i2){
            if(str[i1]!=str[i2]){
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }
}
