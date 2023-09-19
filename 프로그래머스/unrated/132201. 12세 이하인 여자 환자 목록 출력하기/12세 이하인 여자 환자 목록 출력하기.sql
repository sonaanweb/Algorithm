-- 12세 이하인 여자 환자 이름, 환자 번호, 성별코드, 나이, 전화번호 출력/ 전화번호 없는 경우 none
-- 나이는 내림차순(순차 조건) 나이 같으면 환자이름을 기준으로 오름차순 정렬
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO,'NONE') TLNO
FROM PATIENT
WHERE AGE <= 12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC;