# SalesSystem

[//]: # (## TODO: Badges)
[//]: # (https://blog.rocketseat.com.br/como-fazer-um-bom-readme/#tecnologias)

<p align="center">Criado para atender o projeto de Lógica de Programação II do Curso de Análise e Desenvolvimento de Sistemas - (IFSP) Instituto Federal de Educação, Ciência e Tecnologia de São Paulo (1º semestre de 2023).</p>
<p align="center">O projeto tem como objetivo aplicar os conhecimentos iniciais em Orientação a Objeto utilizando a linguagem de programação Java, assim como algumas das boas práticas de programação descritas no S.O.L.I.D para atender a necessidade de uma determinada empresa do setor de vendas, que necessita de um sistema para realizar o cálculo de comissão de vendas por funcionários, sendo que existem algumas regras específicas a serem seguidas para a realização do cálculo (mais detalhes podem ser observados no documento de especificação de requisito do projeto abaixo).</p>

Tabela de conteúdos
=================
<!--ts-->
* [Sobre](#Sobre)
* [Tabela de Conteudo](#tabela-de-conteudo)
* [Instalação](#instalacao)
* [Como usar](#como-usar)
    * [Pre Requisitos](#pre-requisitos)
    * [Local files](#local-files)
    * [Manual do Usuario](#user-manual)
    * [Multiple files](#multiple-files)
    * [Combo](#combo)
* [Tests](#testes)
* [Requisitos](#requisitos)
    * [Documento de Requisito](#local-files) 
* [Tecnologias](#-tecnologias)
* [Status](#status-do-projeto)
* [Features](#features)
* [Autor](#autor)
<!--te-->









### User Manual
Manual do Usuário - Regras para Cálculo de Comissão:
O contexto utilizado para localização de vendas e cadastro é: Região (Estado) e Zona (Cidade);
O usuário irá informar o UF em que mora, e automaticamente será atrelado à uma zona e uma região no seu cadastro;


* para cada novo usuário no mês a empresa pagará 50 reais;
* O cálculo de comissão irá considerar a zona de vendas onde o vendedor é representante;
  * Se houver vendas na zona de vendas atrelada ao vendedor, será verificado se a venda foi realizada dentro do mês
  * Caso exista vendas dentro do mês, é verificado qual categoria do produto vendido para pegar o %(percentual de comissão) e realizado um cálculo do percentual da categoria x valor do produto vendido;
    *Caso o vendedor também seja representante de vendas REGIONAL, será verificado cada zona de venda atrelada à Região para a busca de produtos vendidos no mês;




### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java](https://www.java.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Spring Boot](https://spring.io/)
- [MySQL](https://www.mysql.com/)
- [Lombok](https://projectlombok.org/)
- [Swagger / Heroku](https://projectlombok.org/)


### Status do Projeto

<h4 align="center"> 
	🚧  SalesSystem 🚀💲 Em construção...  🚧
</h4>

### Features

- [x] Entities Mapping
- [x] DB Creation
- [x] DB integration
- [x] Calcular comissão
- [ ] Emissão de Holerite PDF


### Autor

<a href="https://www.linkedin.com/in/klaus-barbosa-707b8a185/">
 <img style="border-radius: 50%;" src="https://media.licdn.com/dms/image/C4D03AQEQQdsG9z8GJA/profile-displayphoto-shrink_200_200/0/1656959342801?e=1686787200&v=beta&t=A7SAX1XdlAYRLZFx5S6TcN_1unGUpQKU2nT4W5FblG8" width="100px;" alt=""/>
 <br />
 <sub><b>Klaus Barbosa</b></sub></a> <a href="https://www.linkedin.com/in/klaus-barbosa-707b8a185/" title="">☕</a>


Feito com ❤️ por Klaus Barbosa 👋🏼 Entre em contato!

<div align="center">
<a href="https://dev.to/klausbarbosa" target="_blank">
<img src=https://img.shields.io/badge/dev.to-%2308090A.svg?&style=for-the-badge&logo=dev.to&logoColor=white alt=devto style="margin-bottom: 5px;" />
</a>
<a href="https://www.linkedin.com/in/klaus-barbosa-707b8a185/" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 5px;" />
</a>
<a href="https://github.com/KlausBarbosa" target="_blank">
<img src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 5px;" />
</a>  
</div>  