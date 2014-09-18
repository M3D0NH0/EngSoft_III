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
('Pastel','Alimentos','2014/10/09',30, 3.50),
('Folhado de Frango','Alimentos','2014/10/12',50, 3.50),
('Pão de Queijo','Alimentos','2014/11/30',60, 3.50),
('Chocolate','Alimentos','2014/10/08',70, 3.50),
('Pastel Frito','Alimentos','2014/12/01',30, 3.50),
('Folhado de Carne','Alimentos','2014/11/30',50, 3.50),
('Mini Pizza','Alimentos','2014/10/08',70, 3.50),
('Coca-Cola','Bebidas','2014/10/18',40, 3.50),
('Água','Bebidas','2015/06/20',300, 2.50),
('Sprite','Bebidas','2014/12/20',40, 3.50),
('Chá Gelado','Bebidas','2014/10/30',50, 3.50),
('Café','Bebidas','2014/10/02',200, 1.75);

select * from produtos

/**
 * 
 * @author HSG, M3D0NH0
 *
 */