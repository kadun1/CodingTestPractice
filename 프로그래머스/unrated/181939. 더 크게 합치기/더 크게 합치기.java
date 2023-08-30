class Solution {
    public int solution(int a, int b) {
        
        Integer first = Integer.parseInt(a +""+ b);
        Integer second = Integer.parseInt(b +""+ a);
        return first >= second ? first : second;
    }
}