package Array;

import java.util.Scanner;

/**
 * N명의 학생을 일렬로 세웠다 -> 학생의 키가 순차대로 주어질 때
 * 맨 앞에 서 있는 선생님이 볼 수 있는 학생 수를 구하는 코드 작성.
 * (자기 앞에 서있는 학생들보다 크면 보이고, 작거나 같으면 보이지 않음)
 * 입력: 첫 줄에 정수 n개 입력 - 그 다음 앞에서부터 순서대로 주어짐
 * 출력: 선생님이 볼 수 있는 최대 학생수 출력
 * 8
 * 130 135 148 140 145 150 150 153
 * -> 5
 */
public class Array2 {

    public int solution(int n, int[] arr){
        int answer = 1, max = arr[0]; // 첫번째 사람은 무조건 보이므로 1 count
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                answer++;
                max = arr[i]; // 기준이 되는 키가 바뀜
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Array2 T = new Array2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n,arr));
    }
}
