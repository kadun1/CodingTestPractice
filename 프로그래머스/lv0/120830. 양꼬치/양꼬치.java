class Solution {
    public int solution(int n, int k) {
        int a = n * 12000;
        
        int discount = n / 10;
        
        k = k - discount;
        
        int b = k * 2000;
        
        
        return a+b;
    }
}