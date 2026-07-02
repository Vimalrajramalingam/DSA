# Write your MySQL query statement below
select e.name as Employee from Employee e
join employee a
on e.managerID=a.id
where e.salary>a.salary ; 
