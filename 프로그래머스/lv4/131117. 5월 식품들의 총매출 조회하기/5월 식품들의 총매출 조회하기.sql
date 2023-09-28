-- 생산일자가 2022년 5월인 식품들의 식품 ID, 식품 이름, 총매출을 조회하는 SQL문
-- 총매출 desc , 식품ID asc
SELECT p.product_id, p.product_name, SUM(p.price * o.amount) TOTAL_SALES
FROM FOOD_PRODUCT p
INNER JOIN FOOD_ORDER o
USING(product_id)
WHERE o.produce_date LIKE CONCAT("2022-05","%")
GROUP BY p.product_id
ORDER BY TOTAL_SALES DESC, product_id ASC;