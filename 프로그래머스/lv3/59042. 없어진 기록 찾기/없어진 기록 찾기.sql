-- 입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는 동물의 ID와 이름을 ID 순 조회
-- outs 테이블에만 있는 것
SELECT o.animal_id, o.name
FROM animal_outs o
LEFT JOIN animal_ins i
USING(animal_id)
WHERE i.animal_id is null
ORDER BY o.animal_id