class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            for (int j = 0; j < n; j++) {
                 answer += aChar;
            }
        }
        return answer;
    }
}