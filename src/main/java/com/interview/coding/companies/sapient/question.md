<h1>**Interview Questions Sapient**</h1>

<h3>Q1) Given a List of Employee (id,name,salary,department), print the employees with max salary in each 
department(both Java 7 and 8 solution)</h3>
<h3>Q2)Given Input Array, find the 2nd maximum integer (O(N) Complexity)</h3>
<h3>Q3)Write an SQL Query for below table to Print the employees under every supervisor</h3>
--------------------------
id | name | department | salary | supervisor_id
---------------------------
Hint: Use Self Join

SELECT A.CustomerName AS CustomerName1, B.CustomerName AS CustomerName2, A.City
FROM Customers A, Customers B
WHERE A.CustomerID <> B.CustomerID
AND A.City = B.City
ORDER BY A.City;
