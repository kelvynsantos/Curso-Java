UPDATE estados SET nome = 'Maranhão' WHERE sigla = 'MA'
SELECT est.nome FROM estados est  WHERE sigla = 'MA'

UPDATE estados set nome = 'Paraná', populacao = 11.32 WHERE sigla='PR'
SELECT est.nome,est.populacao FROM estados est WHERE sigla = 'PR'
