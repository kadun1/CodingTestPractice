import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
List<Integer> list = Arrays.stream(IntStream.rangeClosed(end, start).toArray()).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}