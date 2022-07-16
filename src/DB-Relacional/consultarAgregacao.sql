SELECT regiao as 'região', sum(populacao) as Total from estados group by regiao order by Total desc;

SELECT avg(populacao) as Total from estados
