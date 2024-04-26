class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        
        var first = hp / 5
        var second = (hp % 5) / 3
        var third = (hp % 5 % 3)
        
        answer = first + second + third
        
        
        return answer
    }
}