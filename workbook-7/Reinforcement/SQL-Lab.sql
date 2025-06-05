DROP DATABASE IF EXISTS mysterious_bookstore;

CREATE DATABASE IF NOT EXISTS mysterious_bookstore;

USE mysterious_bookstore;

DROP TABLE IF EXISTS Orders;
DROP TABLE IF EXISTS Customers;
DROP TABLE IF EXISTS Books;
DROP TABLE IF EXISTS Categories;
DROP TABLE IF EXISTS Authors;

CREATE TABLE Authors(
AuthorID VARCHAR(10) PRIMARY KEY,
Name VARCHAR(255) NOT NULL,
Country VARCHAR(255)
);

CREATE TABLE Categories(
CategoryID VARCHAR(10) PRIMARY KEY,
CategoryName VARCHAR(255) NOT NULL
);

CREATE TABLE Books(
BookID VARCHAR(10) PRIMARY KEY,
Title VARCHAR(255) NOT NULL,
AuthorID VARCHAR(10) NOT NULL,
CategoryID VARCHAR(10) NOT NULL,
Price DECIMAL(10,2) NOT NULL,
FOREIGN KEY (AuthorID) REFERENCES Authors(AuthorID),
FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);

CREATE TABLE Customers(
CustomerID VARCHAR(10) PRIMARY KEY,
Name VARCHAR(255) NOT NULL,
Email VARCHAR(255)
);

CREATE TABLE Orders(
OrderID INT PRIMARY KEY AUTO_INCREMENT,
BookID VARCHAR(10) NOT NULL,
CustomerID VARCHAR(10) NOT NULL,
Quantity INT NOT NULL,
OrderDate DATE,
FOREIGN KEY (BookID) REFERENCES Books(BookID),
FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

Insert INTO Authors (AuthorID, Name, Country) VALUES
('A01', 'John Doe', 'USA');

INSERT INTO Categories (CategoryID, CategoryName) VALUES
('C01', 'Mystery');

INSERT INTO Books (BookID, Title, AuthorID, CategoryID, Price) VALUES
('B01', 'Diary of a wimpy kid', 'A01', 'C01', 15.99);

INSERT INTO Customers (CustomerID, Name, Email) VALUES
('E01', 'Jimmy', 'jimmydimmy@example.com');

INSERT INTO Orders (BookID, CustomerID, Quantity, OrderDate) VALUES
('B01', 'E01', 25, '2025-05-23');

