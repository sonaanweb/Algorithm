-- book / author 테이블
-- 카테고리(경제)에 속하는 도서들 도서id,저자명,출판일 리스트 출판일 오름차순
SELECT b.book_id, a.author_name,
date_format(b.published_date, '%Y-%m-%d') published_date
FROM book b
LEFT JOIN author a USING(author_id)
WHERE b.category = '경제'
ORDER BY published_date ASC;