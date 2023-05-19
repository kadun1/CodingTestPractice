import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        return (Math.pow(Arrays.stream(num_list).sum(), 2)) > (Arrays.stream(num_list).reduce((x, y) -> x * y).getAsInt()) ? 1 : 0;
    }
}