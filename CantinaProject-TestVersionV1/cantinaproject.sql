create table produto
(
idPro serial NOT NULL,
nome varchar(20) NOT NULL,
tipo varchar(20) NOT NULL,
preco numeric(10,2) NOT NULL,
quantidade integer NOT NULL,
dataCompra varchar(10) NOT NULL,
valorCompra numeric(10,2) NOT NULL,
fornecedor varchar(20); NOT NULL,
validade Date DEFAULT now()::date
);

alter table produto add constraint idPro_pk primary key(idPro)

select * from produto

drop table produto cascade