class Solution {
    public String solution(String myString) {
        String result = "";
        char[] charArray = myString.toCharArray();
        for (char c : charArray) {
            if(c < 'l') {
                result += 'l';
            } else {
                result += c;
            }
        }
        return result;

    }
}