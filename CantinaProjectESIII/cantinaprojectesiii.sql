create table produtos(
id serial not null,
nome varchar(40) not null,
tipo varchar(40) not null,
validade varchar(20) not null,
quantidade integer not null,
preco numeric(10,2) not null
)

alter table produtos add constraint pro_pk primary key(id);

insert into produtos(nome,tipo,validade,quantidade,preco) values('risolis','salgado','2014/02/01',30,23.2);

select * from produtos



drop table produtos;