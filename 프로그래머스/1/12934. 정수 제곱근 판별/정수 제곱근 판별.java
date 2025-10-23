// n = 121 -> x = 11 의 제곱 판단 return 값은 (x+1)^2 이므로 144
class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = (long)Math.sqrt(n); // 제곱근 함수 - long 형변환 소수점 이하 버림
        
        if(x * x == n){
            answer = (x+1) * (x+1);
        }
        else{
            answer = -1;
        }
        return answer;
        
    }
}



/**
long x = (long) Math.sqrt(n);
return (x*x == n) ? (x+1)*(x+1) : -1;
**/