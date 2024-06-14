class Solution {
    //hello의 각 문자를 세 번씩 반복한 "hhheeellllllooo"
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer += my_string.charAt(i);
            }
        }    
        return answer;
    }
}