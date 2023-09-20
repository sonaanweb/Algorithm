-- PRODUCT / OFFLINE_SALE 테이블 
-- 상품코드 별 매출액(판매가*판매량)합계를 출력하는 쿼리, 매출액 DESC, 상품코드 ASC
-- 결과 컬럼 (product_code / sales)
SELECT p.product_code, SUM(o.sales_amount) * p.price SALES
FROM PRODUCT p
INNER JOIN OFFLINE_SALE o
USING(product_id)
GROUP BY p.product_code
ORDER BY SALES DESC, PRODUCT_CODE ASC;