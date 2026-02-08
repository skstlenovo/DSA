# Write your MySQL query statement below
SELECT e.name
FROM employee e
WHERE e.id IN (
    SELECT managerId
    FROM employee
    GROUP BY managerId
    HAVING COUNT(*) > 4
);
