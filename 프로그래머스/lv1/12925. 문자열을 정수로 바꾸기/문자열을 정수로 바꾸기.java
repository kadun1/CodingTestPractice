class Solution {
    public int solution(String s) {
        int answer = 0;
        String newStr = "";
        if(s.indexOf("-")>-1||s.indexOf("+")>-1){
            newStr = s.substring(1);
            answer = Integer.parseInt(newStr);
            if(s.indexOf("-")>-1){
                answer = answer*-1;
            }
        } else {
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}