class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int minValue = Integer.MAX_VALUE;
            for (int j = s; j <= e; j++) {
                if (arr[j] < minValue && k < arr[j]) {
                    minValue = arr[j];
                }
            }
            if (minValue != Integer.MAX_VALUE) {
                answer[i] = minValue;
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}