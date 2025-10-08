create database student_course_db;
use student_course_db;

CREATE TABLE Students_1NF (
    Student_ID INT PRIMARY KEY,
    Student_Name VARCHAR(50)
);

CREATE TABLE Instructors_3NF (
    Instructor_ID INT PRIMARY KEY,
    Instructor_Name VARCHAR(50)
);

CREATE TABLE Courses_3NF (
    Course_ID INT PRIMARY KEY,
    Course_Name VARCHAR(50),
    Instructor_ID INT,
    FOREIGN KEY (Instructor_ID) REFERENCES Instructors_3NF(Instructor_ID)
);

CREATE TABLE StudentCourses_2NF (
    Student_ID INT,
    Course_ID INT,
    PRIMARY KEY (Student_ID, Course_ID),
    FOREIGN KEY (Student_ID) REFERENCES Students_1NF(Student_ID),
    FOREIGN KEY (Course_ID) REFERENCES Courses_3NF(Course_ID)
);

show tables;

desc StudentCourses_2NF;
desc Students_1NF; -- student name
desc Courses_3NF;  -- course name
desc Instructors_3NF; -- instructor name

select * from couses_3nf;

SELECT s.Student_Name, c.Course_Name, i.Instructor_Name
FROM StudentCourses_2NF as sc
JOIN Students_1NF s ON sc.Student_ID = s.Student_ID
JOIN Courses_3NF c ON sc.Course_ID = c.Course_ID
JOIN Instructors_3NF i ON c.Instructor_ID = i.Instructor_ID;

SELECT c.Course_Name
FROM Courses_3NF c
JOIN Instructors_3NF i ON c.Instructor_ID = i.Instructor_ID
WHERE i.Instructor_Name = 'Mrs. Smith';


SELECT s.Student_Name
FROM StudentCourses_3NF sc
JOIN Students_1NF s ON sc.Student_ID = s.Student_ID
JOIN Courses_3NF c ON sc.Course_ID = c.Course_ID
WHERE c.Course_Name = 'Physics';

SELECT c.Course_Name, COUNT(sc.Student_ID) AS Student_Count
FROM StudentCourses_3NF sc
JOIN Courses_3NF c ON sc.Course_ID = c.Course_ID
GROUP BY c.Course_Name;

SELECT i.Instructor_Name, c.Course_Name
FROM Instructors_3NF i
LEFT JOIN Courses_3NF c ON i.Instructor_ID = c.Instructor_ID
ORDER BY i.Instructor_Name;