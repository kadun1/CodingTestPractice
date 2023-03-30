import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            String s1 = strArr[i];
            list.add(Integer.parseInt(s1));
        }

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        
        return min + " " + max;
    }
}