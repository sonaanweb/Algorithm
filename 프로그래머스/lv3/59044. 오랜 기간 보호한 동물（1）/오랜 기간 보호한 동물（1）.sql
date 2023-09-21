-- 입양 못 간 동물 중, 가장 오래 보호소에 있던 동물 3마리의 이름, 보호 시작일을 조회하는 쿼리문
-- 결과는 보호 시작일 순 조회 ASC
-- 입양 못 간 = OUTS 테이블에 존재 X
SELECT i.name, i.datetime
FROM animal_ins i
LEFT JOIN animal_outs o
USING(animal_id)
WHERE o.animal_id is null
ORDER BY i.datetime ASC
LIMIT 3;
