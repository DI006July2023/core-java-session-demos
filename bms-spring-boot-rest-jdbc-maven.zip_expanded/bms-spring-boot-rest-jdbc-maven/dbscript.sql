CREATE DATABASE book_management_system;
USE book_management_system;
SHOW TABLES;

CREATE TABLE author_details (
    author_id INT AUTO_INCREMENT PRIMARY KEY,
    author_first_name VARCHAR(30),
    author_last_name VARCHAR(30)
);

CREATE TABLE book_details (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    book_title VARCHAR(100),
    book_author_id INT REFERENCES author_details(author_id),
    book_genre VARCHAR(20),
    book_published DATE,
    book_cost INT,
    book_image_url VARCHAR(255)
);

INSERT INTO author_details(author_first_name, author_last_name) VALUE ('Gerinimo', 'Stilton');
INSERT INTO author_details(author_first_name, author_last_name) VALUE ('Patrick', 'Naughton');
INSERT INTO author_details(author_first_name, author_last_name) VALUE ('Rowling', 'J.K');

INSERT INTO book_details(book_title, book_author_id, book_genre, book_published, book_cost, book_image_url) VALUES ('Harry Potter and The Order of Phoenix', 3, 'Fantasy', '2010-03-03', 70, 'https://images.unsplash.com/photo-1626618012641-bfbca5a31239?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=3464&q=80' );
INSERT INTO book_details(book_title, book_author_id, book_genre, book_published, book_cost, book_image_url) VALUES ('Harry Potter and The prizoner of Azkaban', 3, 'Fantasy', '2011-04-04', 80, 'https://images.unsplash.com/photo-1618666012174-83b441c0bc76?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=3387&q=80' );
INSERT INTO book_details(book_title, book_author_id, book_genre, book_published, book_cost, book_image_url) VALUES ('Java Complete Reference', 2, 'Programming', '2009-10-10', 100, 'https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=3388&q=80' );
INSERT INTO book_details(book_title, book_author_id, book_genre, book_published, book_cost, book_image_url) VALUES ('The Fire Dragon', 1, 'Commedy', '2008-11-11', 85, 'https://images.unsplash.com/photo-1543002588-bfa74002ed7e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2730&q=80' );

SELECT * FROM author_details;
SELECT * FROM book_details;