class Solution {
    public boolean isPalindrome(int x) {
        
        int rem, sum = 0;
        int y = x;
        while(x>0){
        rem = x%10;
        x = x/10;
        sum = sum*10+rem;
        }
        if(sum==y){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
