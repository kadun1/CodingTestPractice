import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int a = Arrays.stream(num_list).filter(i->i%2==0).toArray().length;
        int b = Arrays.stream(num_list).filter(i->i%2!=0).toArray().length;
        int[] result = {a, b};
        return result;
    }
}