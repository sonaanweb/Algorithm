class Solution {
    public int solution(int angle) {
        // 예각<90 직각=90 둔각<180 평각=180
        return (angle < 90) ? 1 
             : (angle == 90) ? 2 
             : (angle < 180) ? 3 
             : 4;
    }
}