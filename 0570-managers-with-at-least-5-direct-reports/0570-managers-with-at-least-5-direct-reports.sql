# Write your MySQL query statement below
-- select e.name from Employee e
-- where e.id In(select managerId from Employee 
-- where managerId IS NOT NULL
-- group by managerId
-- having count(*)>=5);

SELECT m.name 
FROM Employee AS e
JOIN Employee AS m 
  ON e.managerId = m.id
GROUP BY m.id, m.name
HAVING COUNT(e.id) >= 5;


