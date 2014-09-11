create table produtos(
id serial not null,
nome varchar(40) not null,
tipo varchar(40) not null,
validade varchar(20) not null,
quantidade integer not null,
preco numeric(10,2) not null
);

alter table produtos add constraint pro_pk primary key(id);

insert into produtos(nome,tipo,validade,quantidade,preco) values
('Risolis','Alimentos','2014/02/01',30, 3.50),
('Coca-Cola','Bebidas','2016/06/20',40,5.00),
('Folhado de Frango','Alimentos','2014/08/30',50,3.50),
('Aguá','Bebidas','2020/06/20',35,4.00),
('Pão de Queijo','Alimentos','2014/08/30',60,3.50),
('Mini Pizza','Alimentos','2014/10/08',70,3.50);

update produtos set nome='Pastel' where nome='Risolis';	
update produtos set nome='Água' where nome='Aguá';	

alter table produtos add column lote integer

update produtos set lote='1' where nome='Pastel'; 
update produtos set lote='1' where nome='Coca-Cola';
update produtos set lote='1' where nome='Folhado de Frango';
update produtos set lote='1' where nome='Água';
update produtos set lote='1' where nome='Pão de Queijo';
update produtos set lote='1' where nome='Mini Pizza';

select * from produtos



drop table produtos;