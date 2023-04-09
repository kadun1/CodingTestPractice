class Solution {
    public int solution(int angle) {
        int result = angle / 90;
        int remain = angle % 90;
        int answer = 0;
        if(remain == 0) {
            if(result == 1) {
                answer = 2;
            } else {
                answer = 4;
            }
        } else {
            if(result == 1){
                answer = 3;
            } else {
                answer = 1;
            }
        }
        return answer;
    }
}