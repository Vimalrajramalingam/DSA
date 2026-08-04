# Write your MySQL query statement below
SELECT employee_id,
case 
when employee_id%2=1 AND name not like 'M%'
then salary  
else 0 END as bonus 
from employees 
order by employee_id;