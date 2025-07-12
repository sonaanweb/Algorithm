package TwoPointers;

import java.util.Scanner;

/**
 * 연속된 자연수의 합 - 수학적 방법
 */
public class Two4 {

    public int solution(int n){
        int answer = 0, cnt = 1;
        n--;
        while(n>0){
            cnt++;
            n = n - cnt;
            if(n % cnt == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Two4 T = new Two4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}


/**
 * ex)
 * n : 타겟 넘버
 * cnt : 연속된 자연수의 개수
 * n = n - cnt : 누적된 값을 빼주는 역할
 * if(n % cnt == 0) : 0으로 나누어 떨어지면 n을 cnt개의 연속된 자연수로 표현 가능
 *
 * n = 15
 * cnt = 1
 * n = 14 ( n--; )
 *
 * while(n>0)
 * cnt = 2 (cnt++;) | n = 12 (n = n - cnt;) | 참 if(n % cnt == 0) | 1 (answer++;)
 *
 * 연속된 두개의 수로 15가 만들어지려면 만들어진 두개의 공간에 1, 2 할당
 * 가장 작은 두 자연수 1+2 = 3, 가장 최소합이 3이라는 뜻.
 * 15를 만들고 싶으니 15-3 = 12가 부족함 -> 동등하게 나누자 12 % 2 = 6
 * 1,2 자리에 +6씩 더해주면 7,8
 */
