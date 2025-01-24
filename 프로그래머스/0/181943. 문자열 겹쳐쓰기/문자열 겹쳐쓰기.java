class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        String pre = my_string.substring(0,s);
        String suf = my_string.substring(s + overwrite_string.length());
        String answer = pre + overwrite_string + suf;
        
        return answer;
    }
}