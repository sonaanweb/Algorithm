-- 코드를 입력하세요
SELECT FACTORY_ID,FACTORY_NAME,ADDRESS FROM FOOD_FACTORY
WHERE ADDRESS LIKE '강원도%'
ORDER BY FACTORY_ID ASC;
-- heidi sql 기준으로 where address = '강원도'; 라고 쳐서 제대로 실행이 안 됐다.
-- like '강원도%' --> 강원도~~~
-- like '%강원도' --> ~~~~강원도
-- like '%강원도%' --> ~~~ 강원도 ~~~~ 의 패턴 조회