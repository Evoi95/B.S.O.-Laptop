create table if not exists pagamentoV1(id_op int primary key auto_increment,metodo varchar(10),esito int ,nomeUtente varchar(5));


delimiter //
create trigger pagaFattura after insert on fattura
for each row
begin 
#0 regolare 1 irregolare
insert into  pagamentov1 values(0,"fattura",0,new.nome);
end;
//
drop trigger pagaFattura;
//
create trigger pagaCartaCredito after insert on cartacredito
for each row
begin
#0 regolare 1 irregolare
insert into  pagamentov1 values(0,"cartac",0,new.nomeP);

end;
//
drop trigger pagaCartaCredito;
