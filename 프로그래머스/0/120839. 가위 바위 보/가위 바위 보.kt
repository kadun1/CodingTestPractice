class Solution {
    fun solution(rsp: String): String {
                val cArr = rsp.toCharArray()
        val result = CharArray(cArr.size)

        for (i in cArr.indices) {
            if (cArr[i] == '2') {
                result[i] = '0'
            } else if (cArr[i] == '0') {
                result[i] = '5'
            } else {
                result[i] = '2'
            }
        }
        return result.concatToString()
    }
}