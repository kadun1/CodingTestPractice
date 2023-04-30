import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] returnArr = new int[arr.length-1];
        if(k%2==0) {
            returnArr = Arrays.stream(arr).map(i -> i + k).toArray();
        } else {
            returnArr = Arrays.stream(arr).map(i -> i * k).toArray();
        }
        return returnArr;
    }
}