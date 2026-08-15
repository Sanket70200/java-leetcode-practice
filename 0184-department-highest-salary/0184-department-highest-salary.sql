# Write your MySQL query statement below
select d.name As Department ,e.name as Employee,e.salary As Salary from Employee e
inner join Department d
on d.id=e.departmentId
where e.salary=(select Max(e2.salary) from Employee e2
where e2.departmentId=e.departmentId);