<img src="img/logo-firedev.png" style="width: 600px; display: block; margin-left: auto; margin-right: auto;">
<h1 style="text-align: center;">Desafio Kitsu Backend- Adriano 😎</h1>

## Agradecimento

<p style="text-align: justify">Primeiramente eu gostaria de agradecer a Firedev por poder participar deste 
projeto que me trouxe um conhecimento muito grande sobre consumo de APIs com 
a utilização do Spring, sendo que na faculdade estou recém no começo do estudo 
sobre esse Framework sensacional do Java, e isso já foi um plus no meu 
desenvolvimento como desenvolvedor Java. </p>

<p style="text-align: justify">Meu agradecimento em especial é para o Guilherme Mallmann e para o Daniel Dias 
que foram muito atenciosos e me incentivaram muito em buscar o conhecimento 
necessário para concluir o desafios, me ajudaram também com dicas e me passaram 
muita energia positiva que me ajudaram a passar algumas noites em claro para a 
finalização deste desafio.</p>

## Sobre o Desafio

Realizar consultas na API [https://kitsu.docs.apiary.io](https://kitsu.docs.apiary.io)

Construir os seguintes endpoints:

<ol>
    <ul>✔️ Retorno dos animes mais populares;</ul>
    <ul>✔️ Retorno dos mangas mais populares;</ul>
    <ul>✔️ Buscar anime ou manga com filtros (título, ano, etc);</ul>
    <ul>✔️ Obter informações de um anime ou manga;</ul>
    <ul>✔️ Obter informações de um episódio de um anime especifico;</ul>
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

- <p style="text-align: justify">Usei o componente Web Client para implementar a base url da API do desafio
  para que toda a uri apontada comece com a URL base juntamente com a uri
  requisitada. Através do builder do Web Client foi feita a configuração de
  um default headers do HTTP e do tipo de mídia que a aplicação irá
  receber, que neste caso é uma String do tipo JSON.</p><br /><br />

- <p style="text-align: justify">Defini um Bean na classe Main para retornar as instancias do Web Client
  nas possíveis classes da aplicação de uma forma mais genérica, ao invés de
  retornar somente na classe service do projeto.</p><br /><br />

- <p style="text-align: justify">Criei os endpoints solicitados na classe controller e injetei o Web Client
  na classe service para poder utilizar a url do desafio juntamente com a uri
  requisitada nos endpoints.</p>

## Plus


<ol>
  <ul>❌ Deploy no Heroku.</ul>
  <ul>❌ Criar estrutura no banco para salvar as buscas do usuário.</ul>
  <ul>❌ Criar um relatório de itens mais pesquisados com base na estrutura criada.</ul>
</ol>

Obs.: Essa parte do desafio ainda não foi implementada por falta de conhecimento técnico, mas será o meu próximo 
desafio pessoal 🙅‍♂️

