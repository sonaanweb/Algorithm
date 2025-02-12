class Solution {
    public int solution(int a, int b, int c) {
        int allsum = a + b + c;
        int onediff = a * a + b * b + c * c;
        int alldiff = a * a * a + b * b * b + c * c * c;
        
        if( a == b && b == c){
            return allsum * onediff * alldiff;
        } else if(a == b || b == c || a == c){
            return allsum * onediff;
        } else {
            return allsum;
        }
    }
}