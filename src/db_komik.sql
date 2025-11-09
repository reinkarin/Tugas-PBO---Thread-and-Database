CREATE DATABASE db_komik;

USE db_komik;

CREATE TABLE komik (
    id INT AUTO_INCREMENT PRIMARY KEY,
    judul VARCHAR(100),
    pengarang VARCHAR(100),
    genre VARCHAR(50),
    tahun_rilis INT
);
