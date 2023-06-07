class Solution {
    public int solution(int price) {
        int answer;
        if (price >= 500000) {
            return floor(price * 0.8);
        } else if (price >= 300000) {
            return floor(price * 0.9);
        } else if (price >= 100000) {
            return floor(price * 0.95);
        }
        answer = price;
        return answer;
    }
    
    public int floor(double b) {
        return (int) Math.floor(b);
    }
}