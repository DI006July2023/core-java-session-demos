USE bms;

SELECT * FROM book_details;

-- using a scalar function  --
-- write a quesry to display book_id, book_title in uppercase and book_cost --
SELECT book_id, upper(book_title), book_cost FROM book_details;

-- using an aggregate function --
-- write a query to find the average cost of all books --
SELECT avg(book_cost) FROM book_details;

-- write a query to find the total number of books --
SELECT count(book_id) FROM book_details;

-- write a query to find the costliest book --
SELECT book_id, max(book_cost) FROM book_details;
SELECT * FROM book_details WHERE book_cost = (SELECT max(book_cost) FROM book_details);
SELECT * FROM book_details WHERE book_cost IN (SELECT max(book_cost) FROM book_details);

SELECT * FROM book_details WHERE book_cost = max(book_cost); -- doesn not work -- 

SELECT current_date();
SELECT current_date() FROM DUAL;


