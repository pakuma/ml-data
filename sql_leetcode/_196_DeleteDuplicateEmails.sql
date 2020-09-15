/*
--Script For Schema
Drop Table If Exists _196_DeleteDuplicateEmails
Go
Create Table _196_DeleteDuplicateEmails
(
	Id int,
	Email varchar(30)
)
Go
Insert Into _196_DeleteDuplicateEmails (Id, Email) Values (1, 'john@example.com')
Insert Into _196_DeleteDuplicateEmails (Id, Email) Values (2, 'bob@example.com')
Insert Into _196_DeleteDuplicateEmails (Id, Email) Values (3, 'john@example.com')
*/
--------------------------------------------------------------------------------------------------------
/*
Write a SQL query to delete all duplicate email entries in a table named Person, keeping only unique emails based on its smallest Id.

+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+
Id is the primary key column for this table.
For example, after running your query, the above Person table should have the following rows:

+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
+----+------------------+
Note:

Your output is the whole Person table after executing your sql. Use delete statement.
*/
/*
Solution

*/
SELECT * FROM [dbo].[_196_DeleteDuplicateEmails]

DELETE Person1 FROM _196_DeleteDuplicateEmails Person1, _196_DeleteDuplicateEmails Person2
WHERE Person1.Email = Person2.Email and Person1.Id > Person2.Id