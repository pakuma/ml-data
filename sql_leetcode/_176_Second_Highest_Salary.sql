/*
--Script For Schema
Drop Table If Exists _176_Second_Highest_Salary
Create Table _176_Second_Highest_Salary
(
	Id int,
	Salary int
)
Insert Into _176_Second_Highest_Salary (Id, Salary) Values (1, 100)
Insert Into _176_Second_Highest_Salary (Id, Salary) Values (2, 200)
Insert Into _176_Second_Highest_Salary (Id, Salary) Values (3, 300)
*/
/*
Write a SQL query to get the second highest salary from the Employee table.

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
For example, given the above Employee table, the query should return 200 as the second highest salary. If there is no second highest salary, then the query should return null.

+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
*/

--Solution
SELECT Max(Salary) FROM _176_Second_Highest_Salary
Where Salary < (Select Max(Salary) FROM _176_Second_Highest_Salary)