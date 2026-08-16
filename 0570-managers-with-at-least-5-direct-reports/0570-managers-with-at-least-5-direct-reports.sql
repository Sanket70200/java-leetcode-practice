# Write your MySQL query statement below
select e.name from Employee e
where e.id In(select managerId from Employee 
where managerId IS NOT NULL
group by managerId
having count(*)>=5);