class Solution {
    public boolean solution(int x) {
        
        int sum = 0;
        int temp = x; // 자릿수 계산
        
        while (temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        
        return x % sum == 0;
    }
}