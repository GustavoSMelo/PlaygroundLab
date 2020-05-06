--1 
SELECT nome, cpf, endereco FROM autor WHERE nacionalidade = 'BR';

--2
SELECT matricula, nome, dt_nascimento FROM autor WHERE nacionalidade != 'BR' AND matricula BETWEEN 100 AND 200;

--3
SELECT * FROM livro WHERE (codigo = 11 OR codigo = 13 OR codigo = 15) AND preco < 100;

--4
SELECT * FROM assunto WHERE descricao LIKE '%sistema%' OR descricao LIKE '%software%';

--5
SELECT * FROM editora WHERE nome LIKE 'a%';

--6
SELECT MIN(preco) FROM livro JOIN editora ON livro.cod_editora = editora.codigo GROUP BY editora.codigo;

--7
SELECT AVG(preco) AS media FROM livros JOIN editora ON livro.cod_editora = editora.codigo WHERE media > 90 GROUP BY editora.codigo

--8
SELECT * FROM autor WHERE nome LIKE '%Jõao%' OR nome LIKE '%Maria%';

--9
SELECT COUNT(*) FROM autor;

--10
SELECT MAX(preco) FROM livro JOIN editora ON livro.cod_editora = editora.codigo GROUP BY editora.codigo;

--11
SELECT * FROM autor WHERE nacionalidade = (SELECT nacionalidade FROM autor WHERE nome = 'Pedro Alcântara');

--12
SELECT * FROM autor WHERE nacionalidade = (SELECT nacionalidade FROM autor WHERE codigo = 2754) and dt_nascimento > (SELECT dt_nascimento FROM autor WHERE codigo = 7788);

--13
--Alternativa D

--14
-- Alternativa B

--15
-- Alternativa A