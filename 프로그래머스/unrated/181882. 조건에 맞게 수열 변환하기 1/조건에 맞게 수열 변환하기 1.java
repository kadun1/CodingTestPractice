class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int j = 0; j < arr.length; j++) {
            int i = arr[j];
            if (i >= 50 && i % 2 == 0) {
                answer[j] = i/2;
            } else if (i < 50 && i % 2 != 0) {
                answer[j] = i*2;
            } else {
                answer[j] = i;
            }
        }
        return answer;
    }
}