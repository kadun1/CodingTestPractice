import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String result = "";
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String s : str){
            result += s;
        }
        
        answer = Long.parseLong(result);
        
        return answer;
    }
}