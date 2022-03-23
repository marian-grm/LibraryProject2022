create table t_books
(
    id integer auto_increment,
    bookname varchar(100),
    bookyear integer,
    bookwriter varchar(100),
    bookprice integer,
    primary key(id)
);

create table t_libraries
(
    id integer auto_increment,
    libraryname varchar(100),
    librarylocation varchar(50),
    primary key(id)
);