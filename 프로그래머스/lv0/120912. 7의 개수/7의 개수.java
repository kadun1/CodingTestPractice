class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i : array) {
            String val = String.valueOf(i);
            String[] splitVal = val.split("");
            for(String str : splitVal) {
                if(str.equals("7")) answer++;
            }
        }
        return answer;
    }
}