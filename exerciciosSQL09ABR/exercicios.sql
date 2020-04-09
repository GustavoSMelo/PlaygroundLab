--1.
select * from scott.emp where job = (select job from scott.emp where empno = 7369);

--2.
select * from scott.emp where job = (select job from scott.emp where empno = 7369) and sal > (select sal from scott.emp where empno = 7876);

--3.
select ename, job, sal from scott.emp where sal = (select min(sal) from scott.emp);

--4.
select * from scott.emp where sal > (select min(sal) from scott.emp where deptno = 20);

--5.
select ename, emp.deptno, job from scott.emp join scott.dept on emp.deptno = dept.deptno where dept.loc = 'DALLAS';

--6. por conta que essa subquery esta retornando mais de um valor, sendo assim é necessario utilizar IN

--7.
select min(sal) from scott.emp group by deptno;

--8.
select ename, deptno from scott.emp where ename like '%T%';

--9. C

--10. 
select max(hiredate) as dataAdmissao, deptno from scott.emp group by deptno order by dataAdmissao desc;
