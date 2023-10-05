-- ANIMAL_INS / ANIMAL_OUTS 
-- 보호소에 들어올 당시에는 중성화 되지 않았지만, 보호소를 나갈 당시에는 중성화된 동물의 아이디와 생물 종, 이름을 조회하는 아이디 순으로 조회하는 SQL 문을 작성
SELECT i.animal_id, i.animal_type, i.name
FROM animal_ins i
INNER JOIN animal_outs o
USING (animal_id)
WHERE i.sex_upon_intake LIKE CONCAT("intact","%")
AND o.sex_upon_outcome NOT LIKE CONCAT("intact","%")
ORDER BY animal_id

-- intake , outcome 상태가 다른 것들로 출력