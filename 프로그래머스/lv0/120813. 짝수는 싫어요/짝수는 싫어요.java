import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
             list.add(i);
        }

        return list.stream().filter(i -> i%2!=0).mapToInt(i -> i).toArray();
    }
}