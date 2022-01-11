<img src="img/logo-firedev.png" style="width: 600px; display: block; margin-left: auto; margin-right: auto;">
<h1 style="text-align: center;">Desafio Kitsu Backend- Adriano 😎</h1>

## Sobre o Desafio

Realizar consultas na API [https://kitsu.docs.apiary.io](https://kitsu.docs.apiary.io)

Construir os seguintes endpoints:

<ol>
    <ul>✔️ Retorno dos animes mais populares;</ul>
    <ul>✔️ Retorno dos mangas mais populares;</ul>
    <ul>✔️ Buscar anime ou manga com filtros (título, ano, etc);</ul>
    <ul>✔️ Obter informações de um anime ou manga;</ul>
    <ul>✔️ Obter informações de um episodio de um anime especifico;</ul>
</ol>

## Tecnologias Utilizadas

<table style="text-align: center">
    <tr>
        <th>Java</th>
        <th>Spring Boot</th>
    </tr>
    <tr style="background-color: lightslategray">
        <td>11.0</td>
        <td>2.6.2</td>
    </tr>
</table>

## Informações Técnicas

- Usei o componente Web Client para implementar a base url da API do desafio
  para que toda a uri apontada comece com a URL base juntamente com a uri
  requisitada. Através do builder do Web Client foi feita a configuração de
  um default headers do HTTP e do tipo de mídia que a aplicação irá
  receber, que neste caso é uma String do tipo JSON. <br /><br />

- Defini um Bean na classe Main para retornar as instancias do Web Client
  nas possiveis classes da aplicação de uma forma mais genérica, ao inves de
  retornar somente na classe service do projeto. <br /><br />

- Criei os endpoints solicitados na classe controller e injetei o Web Client na classe service para poder utilizar a url do desafio juntamente com a uri requisitada nos endpoints.

## Plus

1. Deploy no Heroku.
2. Criar estrutura no banco para salvar as buscas do usuário.
3. Criar um relatório de itens mais pesquisados com base na estrutura criada.
