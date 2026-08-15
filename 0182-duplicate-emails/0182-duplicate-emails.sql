# Write your MySQL query statement below
select email As Email from Person 
group By email
having count(email)>1;