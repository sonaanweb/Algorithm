-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.
-- 상반기 주문 정보 first_half 테이블, 7월 주문 정보 july
-- 총 주문량 두 테이블 SUM, 내림차순, LIMIT 3개
SELECT F.FLAVOR
FROM FIRST_HALF F
INNER JOIN JULY J USING(FLAVOR)
GROUP BY F.FLAVOR
ORDER BY SUM(F.TOTAL_ORDER + J.TOTAL_ORDER) DESC
LIMIT 3;