class Solution {
    
    int sum = 0;
    
    public int solution(int n) {
        return recursive(n);
    }
    
    public int recursive(int n) {
        if (n > 10) {
            sum += n%10;
            return recursive(n/10);
        } else {
            return sum += n;
        }
    }
}