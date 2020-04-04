/*1. Criar as tabelas*/

create table LOC( /*O nome da tabela nao pode ser "local", pois essa é uma palavra reservada */
    cod_loc number(4),
    nome varchar(25) not null,
    primary key(cod_loc)
);

create table DEPTO(
    cod_depto number(4),
    nome varchar2(25) not null,
    cod_loc number(4),
    primary key (cod_depto),
    foreign key (cod_loc) references LOC
);

create table CARGO(
    cod_cargo number(4),
    descricao varchar2(30) not null,
    CBO number(6),
    primary key (cod_cargo)
);

create table FUNC(
    cod_func number(4),
    sobrenome varchar2(25) not null,
    nome varchar2(25) not null,
    salario number(10,2),
    dt_adm date,
    cod_dept number(4),
    cod_cargo number(4),
    primary key (cod_func),
    foreign key (cod_dept) references DEPTO,
    foreign key (cod_cargo) references CARGO
);

/*2. Inserir os valores da tabela LOC*/

insert into LOC (cod_loc, nome) values (1, 'São Paulo');
insert into LOC (cod_loc, nome) values (2, 'Belo Horizonte');
insert into LOC (cod_loc, nome) values (3, 'Guarulhos');
insert into LOC (cod_loc, nome) values (4, 'Campinas');
insert into LOC (cod_loc, nome) values (5, 'Curitiba');
insert into LOC (cod_loc, nome) values (6, 'Rio de janeiro');

/*3. Inserir  os valores na tabela DEPTO */

insert into DEPTO (cod_depto, nome, cod_loc) values (10, 'Contabilidade', 2);
insert into DEPTO (cod_depto, nome, cod_loc) values (20, 'Controladoria', 1);
insert into DEPTO (cod_depto, nome, cod_loc) values (99, 'Financeiro', 4);
insert into DEPTO (cod_depto, nome, cod_loc) values (22, 'TI', 3);
insert into DEPTO (cod_depto, nome, cod_loc) values (25, 'Markting', 7); /*ERROR*/

/*6. Pois estamos inserindo um codigo de localização que não existe,
É possivel resolver colocando um codigo de loc que já existe na database */

/*7. Inserir o departamento 25 */
insert into DEPTO (cod_depto, nome, cod_loc) values (25, 'Markting', 5); 

/*8. Teste de FK e PK*/
insert into LOC (cod_loc, nome) values (5, 'Sorocaba');
insert into DEPTO (cod_depto, nome, cod_loc) values (10, 'Suporte', 3);

/*9. adicionar outros departamentos */
insert into DEPTO (cod_depto, nome, cod_loc) values (33, 'Vendas', 1);
insert into DEPTO (cod_depto, nome, cod_loc) values (44, 'Recursos Humanos', 1);
insert into DEPTO (cod_depto, nome, cod_loc) values (55, 'Cobrança', 4);

/*10. Adicionar os valores na tabela CARGO */
insert into CARGO (cod_cargo, descricao, CBO) values (3, 'Analista de Sistemas', 252215);
insert into CARGO (cod_cargo, descricao, CBO) values (4, 'Analista de Negócios', 252218);
insert into CARGO (cod_cargo, descricao, CBO) values (6, 'Supervisor de TI', 252114);
insert into CARGO (cod_cargo, descricao, CBO) values (10, 'Programador Jr', 252211);
insert into CARGO (cod_cargo, descricao, CBO) values (11, 'Programador Pleno', 252212);
insert into CARGO (cod_cargo, descricao, CBO) values (15, 'Diretor de TI', 252110);

/*11. Adicionar dados na tabela FUNC*/

insert into FUNC (cod_func, sobrenome, nome, salario, dt_adm, cod_cargo, cod_dept) values (12, 'Pereira', 'Márcia', 1200, '12-feb-2019', 3, 10);
insert into FUNC (cod_func, sobrenome, nome, salario, dt_adm, cod_cargo, cod_dept) values (23, 'Silva', 'Rafael', 2000, sysdate, 6, 33);
insert into FUNC (cod_func, sobrenome, nome, salario, dt_adm, cod_cargo, cod_dept) values (25, 'Braga', 'Silvia', 800, '25-may-2016', 10, 10);
insert into FUNC (cod_func, sobrenome, nome, salario, dt_adm, cod_cargo, cod_dept) values (31, 'Moraes', 'Débora', 1350, sysdate, 11, 25);
insert into FUNC (cod_func, sobrenome, nome, salario, dt_adm, cod_cargo, cod_dept) values (14, 'Sanchez', 'Monica', 3000, '28-may-2017', 10, 15);
insert into FUNC (cod_func, sobrenome, nome, salario, dt_adm, cod_cargo, cod_dept) values (8, 'Barbosa', 'Rogério', 3500, '01-dec-2014', 15, 99);
insert into FUNC (cod_func, sobrenome, nome, salario, dt_adm, cod_cargo, cod_dept) values (9, 'Gomes', 'José', 4000, sysdate, 11, 55);
insert into FUNC (cod_func, sobrenome, nome, salario, dt_adm, cod_cargo, cod_dept) values (10, 'Cardose', 'Pedro', 2100, sysdate, 3, 55);

/*12. Por conta que nao existe nenhum departamento com numero 15,
inserindo um departamento com numero valido, o funcionario sera inserido com exito*/

/*13. Insira as inserções */
insert into FUNC (cod_func, sobrenome, nome, salario, dt_adm, cod_cargo, cod_dept) values (14, 'Sanchez', 'Monica', 3000, '28-may-2017', 10, 55);

/*14. alterar nome do departamento 24 para RH*/
update DEPTO set nome = 'RH' where cod_depto = 44;

/*15. alterar o salario do funcionario com codigo 23 para 2200 */
update FUNC set salario = 2200 where cod_func = 23;

/*16. executar o codigo: */
    UPDATE Depto
    SET cod_loc = 7
    WHERE cod_depto = 33;
    /*Resultado: Error de violação de chave*/
    /*Como resolver: colocando um codigo de localização valida, pois nao existe localização com codigo 7 */


/*17. Remover o funcionado de codigo 12 */
delete from func where cod_func = 12;

/*18 Efetive todas as alterações */
select * from func;
select * from func where cod_func = 12;
commit;

/*19. */
    /*A. */
        select nome, sobrenome, dt_adm, (salario + 200) * 12 as SALARIO_ANUAL_COM_BONUS from FUNC;  
    /*B. */
    select * from func where salario between 2000 and 3000;
    
    /*C. */
    select * from depto where nome like '%Fin%';
    
    /*D. */
    select * from func where nome like 'M%';

    /*E. */
    select FUNC.nome, FUNC.sobrenome, CARGO.DESCRICAO as Cargo from FUNC join CARGO on FUNC.cod_cargo = CARGO.cod_cargo where cargo.descricao like '%Sistema%';
    
    /*F */
        select sum(FUNC.salario) as SOMA, avg(FUNC.salario) MEDIA from FUNC join CARGO on FUNC.cod_cargo = CARGO.cod_cargo group by FUNC.cod_cargo;
    /*G*/
        select count(*) as Contagem_de_pessoas_por_cargo from FUNC join CARGO on FUNC.cod_cargo = CARGO.cod_cargo group by FUNC.cod_cargo;
    
    /*H */
        select count(*) as Contagem_de_cargos from CARGO;
        select count(*) as Contagem_de_departamentos from DEPTO;
    /*I*/
    select max(salario) from FUNC join DEPTO on FUNC.cod_dept = DEPTO.cod_depto where FUNC.salario > 1100 group by FUNC.cod_dept;
    