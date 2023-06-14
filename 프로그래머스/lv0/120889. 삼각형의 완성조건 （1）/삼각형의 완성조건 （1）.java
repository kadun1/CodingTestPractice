import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt();
        return (Arrays.stream(sides).sum() - max > max) ? 1 : 2;
    }
}