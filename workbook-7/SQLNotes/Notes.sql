-- Drop the database if it exists
DROP DATABASE IF EXISTS School;

-- Create the school database
CREATE DATABASE IF NOT EXISTS School;

-- Switch to the School database
USE School;

-- Drop tables if they exist
DROP TABLE IF EXISTS StudendCourses;
DROP TABLE IF EXISTS Students;
DROP TABLE IF EXISTS Courses;

CREATE TABLE Students(
StudentID INT AUTO_INCREMENT PRIMARY KEY,
FirstName VARCHAR(50) NOT NULL,
LastName VARCHAR(50) NOT NULL,
BirthDate DATE,
EnrollmentDate DATE,
Email VARCHAR(100)
);

-- Create the Courses table
CREATE TABLE Courses(
CourseID INT AUTO_INCREMENT PRIMARY KEY,
CourseName VARCHAR(100) NOT NULL,
CourseDescription TEXT,
Credits INT NOT NULL
);

-- Create the student courses table
CREATE TABLE StudentCourses(
StudentCourseID INT AUTO_INCREMENT PRIMARY KEY,
StudentID INT,
CourseID INT,
EnrollmentDate DATE,
FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);

-- Insert sample data into Students table
INSERT INTO Students (FirstName, LastName, BirthDate, EnrollmentDate, Email)
VALUES
("John", "Doe", "2000-01-05", "2018-09-01", "john.doe@example.com"),
("Jane", "Smith", "1999-04-22", "2018-09-01", "janesmith.@example.com");

-- Insert sample data into Courses table
INSERT INTO Courses (CourseName, CourseDescription, Credits)
VALUES
("Introduction to Computer Science", "A beginner course in computer science", 3),
("Calculus I", "An introduction to calculus", 4);

-- Insert data into Student Courses table
INSERT INTO StudentCourses (StudentID, CourseID, EnrollmentDate)
VALUES
(1, 1, "2018-09-01"),
(2, 2, "2018-09-01")