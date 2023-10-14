class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000]; // 배열의 값은 0부터 999까지(인덱스)

        int maxCount = 0;
        int answer = -1;

        for (int num : array) {
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = i;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount && i != answer) {
                // 중복된 최빈값이 존재
                return -1;
            }
        }

        return answer;
    }
}