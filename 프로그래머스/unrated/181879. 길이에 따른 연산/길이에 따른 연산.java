import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length > 10) {
            answer = Arrays.stream(num_list).sum();
            return answer;
        } else {
            answer = 1;
            for (int i : num_list) {
                answer *= i;
            }
            return answer;
        }
    }
}