SELECT * FROM estados;

SELECT sigla,nome AS 'Nome do Estado' FROM estados WHERE regiao='Sudeste';

SELECT nome, regiao,populacao from estados WHERE populacao >= 10 ORDER BY populacao DESC