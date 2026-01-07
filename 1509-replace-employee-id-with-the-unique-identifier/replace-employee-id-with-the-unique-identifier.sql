# Write your MySQL query statement below
Select unique_id, name from employees
left join employeeUNI
on employees.id=employeeUNI.id;