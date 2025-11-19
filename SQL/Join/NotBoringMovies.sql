# leetcode 620
select *
from Cinema
Where 
mod(id,2) = 1
and description != 'boring'
order by rating desc;
