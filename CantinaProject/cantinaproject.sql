﻿create table produto
(
idPro serial NOT NULL,
nome varchar(20) NOT NULL,
tipo varchar(20) NOT NULL
);

alter table produto add constraint idPro_pk primary key(idPro)

select * from produto