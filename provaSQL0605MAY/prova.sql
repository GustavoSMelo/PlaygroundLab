--1
SELECT cod_instrutor, nome, telefone, to_char(dt_admissão, 'dd/mm/yyyy') FROM instrutores WHERE cod_depto <> 20 AND cod_depto <> 22 AND cod_depto <> 44 AND cod_depto <> 99;

--2
SELECT * FROM instrutores WHERE e-mail like '%gmail%' AND (cod_depto = 11 OR cod_depto = 77 OR cod_depto = 99); 

--3
SELECT COUNT(*) FROM instrutores HAVING COUNT(*) > 5 GROUP BY cod_depto;

--4
SELECT * FROM instrutores WHERE cod_depto = (SELECT cod_depto FROM instrutores WHERE cod_instrutor = 9999) AND salario > (SELECT salario FROM instrutores WHERE cod_instrutor = 3344);

