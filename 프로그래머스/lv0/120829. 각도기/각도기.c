#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
// 예각<90 직각=90 둔각>90 평각=180
int solution(int angle) {
    int answer = 0;
    
    if(angle < 90){
        answer = 1;
    } else if (angle == 90){
        answer = 2;
    } else if (angle < 180){ // 91~180 미만까지
        answer = 3;
    } else if (angle == 180){
        answer = 4;
    }
    return answer;
}