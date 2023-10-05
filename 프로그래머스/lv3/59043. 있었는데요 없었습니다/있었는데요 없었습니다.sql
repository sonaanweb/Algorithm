-- 보호 시작일보다 입양일이 더 빠른 동물의 아이디, 이름 조회 쿼리문 결과는 보호시작일 빠른순 (ASC)
-- ANIMAL_INS , ANIMAL_OUTS (id using)
SELECT i.animal_id, i.name
FROM ANIMAL_INS i
LEFT JOIN ANIMAL_OUTS o
USING (animal_id)
WHERE i.datetime > o.datetime
ORDER BY i.datetime ASC;