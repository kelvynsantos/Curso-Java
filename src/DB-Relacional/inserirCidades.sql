INSERT INTO cidades (nome,area,estado_id)
VALUES('Campinas',795,25);

INSERT INTO cidades(nome,area,estado_id)
VALUES('Niterói',133.9,19);

INSERT INTO cidades(nome,area,estado_id)
VALUES('Caruaru',920.6,(SELECT id FROM estados WHERE sigla='PE'));

SELECT * FROM cidades