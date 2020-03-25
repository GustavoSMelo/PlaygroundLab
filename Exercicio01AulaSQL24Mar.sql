
create table regiao(codigo number(2),
    nome varchar(60) not null,
    primary key (codigo),
    unique (nome));

insert into regiao(codigo, nome) values (1, 'Norte');
insert into regiao(codigo, nome) values (2, 'Leste');
insert into regiao(codigo, nome) values (3, 'Sul');
insert into regiao(codigo, nome) values (4, 'Oeste');

create table empregado(codigo number(7),
    nome varchar(60) not null,
    sobrenome varchar(60) not null,
    salario number(11,2),
    dt_admissao date,
    cod_dept number(7),
    primary key (codigo),
    foreign key (cod_dept) references departamento
);

    
create table departamento(
    codigo number(7),
    nome varchar(60) not null,
    codigo_regiao number(2),
    primary key(codigo),
    foreign key (codigo_regiao) references regiao
);

insert into departamento(codigo, nome, codigo_regiao) values (1, 'Departamento de marketing', 1);
insert into departamento(codigo, nome, codigo_regiao) values (2, 'Departamento de ti', 1);
insert into departamento(codigo, nome, codigo_regiao) values (3, 'Departamento de negocios', 2);
insert into departamento(codigo, nome, codigo_regiao) values (4, 'Departamento de analise', 3);
insert into departamento(codigo, nome, codigo_regiao) values (5, 'Departamento de projetos', 3);
insert into departamento(codigo, nome, codigo_regiao) values (6, 'Departamento de requisitos', 4);
insert into departamento(codigo, nome, codigo_regiao) values (7, 'Departamento de suporte', 2);
insert into departamento(codigo, nome, codigo_regiao) values (8, 'Departamento de telecomunicacao', 2);
insert into departamento(codigo, nome, codigo_regiao) values (9, 'Controladoria', 4);
insert into departamento(codigo, nome, codigo_regiao) values (10, 'Manutenção', 3);

select * from departamento;

insert into empregado(codigo, nome, sobrenome, salario, dt_admissao, cod_dept) values (1, 'Elana', 'Silva', 1200.0, null, 9);
insert into empregado(codigo, nome, sobrenome, salario, dt_admissao, cod_dept) values (2, 'Artorias', 'Santos', 1200.0, sysdate, 9);
insert into empregado(codigo, nome, sobrenome, salario, dt_admissao, cod_dept) values (3, 'Ornistain', 'Yamaguti', 1200.0, sysdate, 9);
insert into empregado(codigo, nome, sobrenome, salario, dt_admissao, cod_dept) values (4, 'Venderick', 'Carvalho', 1680.0, sysdate, 9);
insert into empregado(codigo, nome, sobrenome, salario, dt_admissao, cod_dept) values (5, 'Gael', 'Antonidas', 2350.0, '12-JAN-90', 9);

select * from empregado;
