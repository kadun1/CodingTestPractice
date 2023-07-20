class Solution {
    public int[] solution(int[] num_list) {
        int lastNum = num_list[num_list.length - 1];
        int beforeLastNum = num_list[num_list.length - 2];
        int last =  lastNum > beforeLastNum ? lastNum - beforeLastNum : lastNum * 2;
        if (lastNum > beforeLastNum) {
            last = lastNum - beforeLastNum;
        } else {
            last = lastNum * 2;
        }
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        answer[answer.length-1] = last;
        return answer;
    }
}