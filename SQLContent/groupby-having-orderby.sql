SHOW DATABASES;
USE bms;
SHOW TABLES;
SELECT * FROM book_details;

-- write a query to display the total number of books --
SELECT count(book_id) FROM book_details;

-- write a query to display the total number of books writtern by each author--
SELECT book_author, count(book_id) FROM book_details GROUP BY book_author;

-- write a query to display the total number of books writtern by J.K.Rowling --
SELECT count(book_id) FROM book_details WHERE book_author = 'J.K.Rowling';

UPDATE book_details SET book_cost='175' WHERE book_id=3;

-- write a query to display the average cost of books in the book store--
SELECT avg(book_cost) FROM book_details;

-- write a query to display the average cost of books writtern by each author--
SELECT book_author, avg(book_cost) FROM book_details GROUP BY book_author;

-- write a query to display the average cost of books writtern by each author whose average book cost is above 150--
SELECT book_author, avg(book_cost) FROM book_details GROUP BY book_author HAVING avg(book_cost)>150;
SELECT book_author, avg(book_cost) AS 'avg_book_cost' FROM book_details GROUP BY book_author HAVING avg_book_cost>150;

-- write a query to display the average book cost of commedy books writtern by each author having average cost less than 150 --
SELECT upper(book_author), avg(book_cost) AS 'avg_book_cost' 
		FROM book_details 
        WHERE book_genre='Commedy' 
        GROUP BY book_author 
        HAVING avg_book_cost>150;

-- write a query to display all the authors -- 
SELECT book_author FROM book_details GROUP BY book_author ;
SELECT DISTINCT book_author FROM book_details;
	
-- write a query to display all the books in ascending order of book_title --
SELECT * FROM book_details ORDER BY book_title;
SELECT * FROM book_details ORDER BY book_title ASC;

-- write a query to display all the books in descending order of book_title --
SELECT * FROM book_details ORDER BY book_title DESC;

-- write a query to display books in ascending order of book_author starting with the most expensive book  first -- 
SELECT * FROM book_details ORDER BY book_author, book_cost DESC; 