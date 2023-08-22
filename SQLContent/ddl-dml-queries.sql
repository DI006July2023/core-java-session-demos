SHOW DATABASES;

CREATE DATABASE bms;

USE bms;

CREATE TABLE book_details (
    book_id INT,
    book_title VARCHAR(100),
    book_author VARCHAR(30),
    book_genre VARCHAR(20),
    book_published DATE,
    book_cost INT
);

DESC book_details;

ALTER TABLE book_details ADD book_image_url VARCHAR(255);

ALTER TABLE book_details CHANGE COLUMN book_image_url book_img_url VARCHAR(255);

DROP TABLE book_details;

SHOW tables;

INSERT INTO book_details VALUES(101, 'Fantastic Beasts and where to find them', 'J.K.Rowling', 'Fanstasy', '2010-10-10', 125, '');

SELECT book_title, book_id FROM book_details;

SELECT * FROM book_details;

INSERT INTO book_details VALUES(102, 'Fantastic Beasts and secrets of Dumbledore', 'J.K.Rowling', 'Fanstasy', '2013-11-11', 150, '');

INSERT INTO book_details(book_id, book_title) VALUES(103, 'Harry Potter and the Prisoner of Azkaban');

DELETE FROM book_details; -- be careful! this will delete all the record in the table book_details --
DELETE FROM book_details WHERE book_id=103;

UPDATE book_details SET book_cost=145;-- be careful! this will update all the records book_cost to 145 --
UPDATE book_details SET book_cost=145 WHERE book_id=102;

-- display books whose cost is greater than 130 -- 
SELECT * FROM book_details WHERE book_cost>130;

