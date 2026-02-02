# Write your MySQL query statement below
Select id from Weather w
where w.temperature > (select temperature from weather where recordDate= Date_Sub(w.recordDate, interval 1 day))