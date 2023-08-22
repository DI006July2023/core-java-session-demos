SHOW databases;
USE bms;
DROP TABLE book_details;

--  adding primary key at column level --
CREATE TABLE book_details (
    book_id INT PRIMARY KEY,
    book_title VARCHAR(100),
    book_author VARCHAR(30),
    book_genre VARCHAR(20),
    book_published DATE,
    book_cost INT,
    book_image_url VARCHAR(255)
);

INSERT INTO book_details VALUES(101, 'Fantastic Beasts and where to find them', 'J.K.Rowling', 'Fanstasy', '2010-10-10', 125, '');
INSERT INTO book_details VALUES(101, 'Fantastic Beasts and where to find them', 'J.K.Rowling', 'Fanstasy', '2010-10-10', 125, '');

DROP TABLE book_details;

--  adding primary key at table level --
CREATE TABLE book_details (
    book_id INT,
    book_title VARCHAR(100),
    book_author VARCHAR(30),
    book_genre VARCHAR(20),
    book_published DATE,
    book_cost INT,
    book_image_url VARCHAR(255),
    PRIMARY KEY(book_id)
);

INSERT INTO book_details VALUES(101, 'Fantastic Beasts and where to find them', 'J.K.Rowling', 'Fanstasy', '2010-10-10', 125, '');
INSERT INTO book_details VALUES(101, 'Fantastic Beasts and where to find them', 'J.K.Rowling', 'Fanstasy', '2010-10-10', 125, '');

DROP TABLE book_details;

CREATE TABLE book_details (
    book_id INT,
    book_title VARCHAR(100),
    book_author VARCHAR(30),
    book_genre VARCHAR(20),
    book_published DATE,
    book_cost INT,
    book_image_url VARCHAR(255)
);

--  adding primary key after the table is created --
ALTER TABLE book_details ADD PRIMARY KEY(book_id);

INSERT INTO book_details VALUES(101, 'Fantastic Beasts and where to find them', 'J.K.Rowling', 'Fanstasy', '2010-10-10', 125, '');
INSERT INTO book_details VALUES(101, 'Fantastic Beasts and where to find them', 'J.K.Rowling', 'Fanstasy', '2010-10-10', 125, '');

DROP TABLE book_details;

--  auto generate--
CREATE TABLE book_details (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    book_title VARCHAR(100),
    book_author VARCHAR(30),
    book_genre VARCHAR(20),
    book_published DATE,
    book_cost INT,
    book_image_url VARCHAR(255)
);

INSERT INTO book_details(book_title, book_author, book_genre, book_published, book_cost, book_image_url) VALUES('Fantastic Beasts and where to find them', 'J.K.Rowling', 'Fanstasy', '2010-10-10', 125, '');
SELECT * FROM book_details;
INSERT INTO book_details(book_title, book_author, book_genre, book_published, book_cost, book_image_url) VALUES('Harry Potter and the Deathly Hallows', 'J.K.Rowling', 'Fanstasy', '2010-11-11', 150, '');