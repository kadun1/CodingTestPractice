class Solution {
    public String solution(String s) {
String answer = "";
        String s1 = s.toLowerCase();
        String[] split = s1.split("");
        for (int i = 0; i < split.length; i++) {
            String now = split[i];
            String before = "";
            if (i != 0) {
                before = split[i-1];
            } else {
                now = now.toUpperCase();
            }
            if (before.equals(" ")) {
                answer += now.toUpperCase();
            } else {
                answer += now;
            }
        }
        return answer;
    }
}