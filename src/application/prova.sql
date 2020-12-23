select * from pagamento;

select spesaTotale  from pagamento where 1+last_insert_id()=id_op;
select * from cartacredito;

select Cod_isbn from libro where titolo="Scheletri";