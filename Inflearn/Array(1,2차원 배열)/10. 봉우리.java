package Array;

import java.util.Scanner;

/**
 * N*N 격자판에 지도 정보 주어짐. 각 격자에는 그 지역의 높이가 쓰여져있다.
 * 각 격자판의 숫자 중 자신의 `상하좌우 숫자보다 큰 숫자`는 봉우리 지역이며, 봉우리 지역이 몇 개 있는 지 알아내는 코드 작성
 * 격자의 가장자리는 0으로 초기화 되었다고 가정
 */
public class Array10 {
    // 방향 배열 설정 - 위 → 오른쪽 → 아래 → 왼쪽
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};

    public int solution(int n, int[][] arr){
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;    // 봉우리 판단
                for(int k=0; k<4; k++){ // k = 방향 변수
                    int nx = i+dx[k];   // 행 좌표
                    int ny = j+dy[k];   // 열 좌표
                    // 네 방향 중 같거나 큰 값이 있으면 봉우리 X
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]){ // 배열 내 체크 (가장자리가 0)
                        flag = false;
                        break; // 모두 탐색할 필요 없으므로 break 추가
                    }
                }
                if(flag) answer++; // true = 봉우리 카운팅(기본 값)
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Array10 T = new Array10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n]; // n*n 격자판
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n,arr));
    }
}


// ----------------------------------------------------------------------------------------------------


/**
 * ✅ 2. 배열 자체를 크게 만들어서 격자 바깥을 전부 0으로 깔아두는 방법 - 범위 체크 제거시에도 인덱스 에러 X
 * 모든 건 동일하고 solution 내 함수만 살짝 변경
 */
public int solution(int n, int[][] arr){
    int answer = 0;

    // 가장 자리가 0인 n+2 배열 생성
    int[][] map = new int[n+2][n+2];
    // 가운데(봉우리 체크 값) 배열 복사
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            map[i][j] = arr[i-1][j-1];
        }
    }

    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            boolean flag = true;
            for(int k=0; k<4; k++){
                int nx = i + dx[k];
                int ny = j + dy[k];
                if(map[nx][ny] >= map[i][j]){
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
    }
    return answer;
}



입력
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2

-> 10
