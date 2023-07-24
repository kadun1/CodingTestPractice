class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        return sqrt - Math.floor(sqrt) > 0 ? 2 : 1;
    }
}