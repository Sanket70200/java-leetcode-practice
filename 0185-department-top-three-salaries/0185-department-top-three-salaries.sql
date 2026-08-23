# Write your MySQL query statement below
select Department, Employee, Salary from(
    select d.name As Department,
    e.name As Employee,
    e.salary As Salary,
    dense_rank() over(partition by e.departmentId 
    order by e.salary desc ) As rnk
    from Employee e
    join Department d
    on e.departmentId=d.id)t
  
 where rnk <=3;