select a.name AS Employee
from Employee a
join Employee m on a.managerId = m.id
where a.salary > m.salary
