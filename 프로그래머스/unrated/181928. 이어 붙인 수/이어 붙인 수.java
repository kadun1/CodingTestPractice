class Solution {
    public int solution(int[] num_list) {

        String hstr = "";
        String jstr = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i]%2==0) {
                jstr += String.valueOf(num_list[i]);
            } else {
                hstr += String.valueOf(num_list[i]);
            }
        }

        return Integer.parseInt(hstr) + Integer.parseInt(jstr);
    }
}