-- 아이스크림 (조건)총주문량이 3,000보다 높으면서 주 성분이 과일인 / 아이스크림의 맛
-- 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요. (join 컬럼명 동일 using)
SELECT FLAVOR
FROM FIRST_HALF
INNER JOIN ICECREAM_INFO USING (FLAVOR)
WHERE INGREDIENT_TYPE = 'fruit_based' AND TOTAL_ORDER > 3000
ORDER BY TOTAL_ORDER DESC;