create table editora(
    cod_editora number(7) not null,
    nome varchar(60) not null,
    contato varchar(20) not null,
    email_contato varchar(80) not null,
    primary key (cod_editora)
);

create table livro(
    cod_livro number(7) not null,
    titulo varchar(80) not null,
    genero varchar(40) not null,
    edicao varchar(40) not null,
    ano_publicacao date not null,
    valor number(11,2) not null,
    cod_editora number(7),
    primary key (cod_livro),
    foreign key (cod_editora) references editora
);

insert into editora(cod_editora, nome, contato, email_contato) values (1, 'Editora panini', '(11) 99792-2162', 'panini@gmail.com');
insert into editora(cod_editora, nome, contato, email_contato) values (2, 'Girasol', '(33) 91902-2381', 'girasol@editora.com');
insert into editora(cod_editora, nome, contato, email_contato) values (3, 'Escritora Jennifer', '(11) 94744-0774', 'Jennifer@gmail.com');
insert into editora(cod_editora, nome, contato, email_contato) values (4, 'Editora LoveBooks', '(11) 99792-6870', 'Love@Books.com');
insert into editora(cod_editora, nome, contato, email_contato) values (5, 'Editora ReadWithLove', '(11) 91198-0022', 'ReadWith@Love.com');

select * from editora;

insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (1, 'Nemesis: the return', 'Sci-fi', 'edicao 1', '18-NOV-18', 120.0, 3);
insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (2, 'Resident evil 3 Remake: the story', 'Horror', 'edicao 3', sysdate, 230.0, 1);
insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (3, 'Lords of rings', 'RPG', 'edicao 19', '19-MAR-20', 120.0, 3);
insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (4, 'Dracula: the new era of vampires', 'Sci-fi', 'edicao 1', '01-JAN-20', 322.0, 4);
insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (5, 'Armaggedon', 'Sci-fi', 'edicao 4', '03-SEP-06', 120.0, 3);
insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (6, 'Bloodborne', 'Lovecraftian', 'edicao 3', '03-OCT-16', 276.32, 5);
insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (7, 'Typescript + NodeJS', 'Education', 'edicao 3', sysdate, 20.0, 2);
insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (8, 'How to design games?', 'Education', 'edicao 9', '23-APR-19', 23.0, 1);
insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (9, 'Webdesign with ReactJS', 'Education', 'edicao 2', '02-DEC-17', 70.0, 2);
insert into livro(cod_livro, titulo, genero, edicao, ano_publicacao, valor, cod_editora) values (10, 'Dark souls: the art in form of game', 'RPG', 'edicao 2', sysdate, 100.0, 4);

select * from livro;

select * from livro where cod_editora = 22;
select * from editora where email_contato like '%@gmail%';

select max(valor) from livro where cod_editora = 1 and valor >= 80;
select max(valor) from livro where cod_editora = 2 and valor >= 80;
select max(valor) from livro where cod_editora = 3 and valor >= 80;
select max(valor) from livro where cod_editora = 4 and valor >= 80;
select max(valor) from livro where cod_editora = 5 and valor >= 80;

update editora set nome = 'Editora Girasol' where cod_editora = 2;

select max(ano_publicacao) from livro;

update livro set titulo = 'Piratas do caribe' where ano_publicacao = (select max(ano_publicacao) from livro);

delete from livro where ano_publicacao = (select min(ano_publicacao) from livro);
