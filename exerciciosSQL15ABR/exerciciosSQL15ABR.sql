--1.
select * from hr.employees where salary >= 10000 and job_id like '%MAN%';

--2.
select min(salary), max(salary), sum(salary) from hr.employees where job_id like '%REP%';

--3.
select min(hire_date), max(hire_date) from hr.employees;

--4.
select count(*) from hr.employees where department_id = 50;

--5.
select department_id as departamento, round(avg(salary), 2) as media_salarial from hr.employees where salary > 700 group by department_id;

--6.
create view view_six as select employee_id as codigo_empregado, first_name as nome, job_id as profissao from hr.employees;
select * from view_six;
commit;

--7.
create view view_seven as select first_name, job_id, hire_date from hr.employees where department_id = 30 and salary > 1500;
select * from view_seven;
commit;

--8.
create view view_eight as select employee_id, first_name, job_id, hire_date from hr.employees where job_id like '%SA_MAN%' or job_id like '%CLERK%';
select * from view_eight;
commit;

--9.
create view view_nine as select first_name, job_id, department_id from hr.employees where department_id = 20 or department_id = 10;
select * from view_nine;
commit;

--10.
create view depart_IT as select department_id, department_name from hr.departments where department_name like '%IT%' or department_name like '%Sales%';
select * from depart_IT;
commit;

--11.
create view view_eleven as select first_name, job_id, hire_date from hr.employees where salary > 1500 and (department_id =30 or department_id = 10);
select * from view_eleven;
commit;

--12.
create or replace view view_seven as select first_name, job_id, hire_date from hr.employees where (department_id = 30 or department_id = 10) and salary > 1500;
select * from view_seven;
commit;

--13.
create view view_thirteen as select
hr.employees.first_name, hr.employees.last_name, hr.employees.department_id, hr.departments.department_name 
from hr.employees
join hr.departments on hr.departments.department_id = hr.employees.department_id;

select * from view_thirteen;
commit;
