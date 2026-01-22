💱 Conversor de Moedas em Java (Console)

Projeto desenvolvido como parte do Praticando Java: Challenge Conversor de Moedas, da Alura, em parceria com o programa Oracle Next Education (ONE).

O desafio tem como objetivo consolidar conhecimentos em Java, Programação Orientada a Objetos, consumo de API externa, manipulação de JSON e boas práticas de versionamento com Git/GitHub.

🎯 Objetivo do Projeto

Construir uma aplicação em Java que funcione como um conversor de moedas, com interação via console, permitindo ao usuário escolher entre diferentes opções de conversão e obter valores atualizados em tempo real.

Este projeto faz parte do módulo Praticando Java, cujo foco é o aprendizado prático por meio da construção de um sistema_toggle realista e funcional.

🌍 Contexto do Challenge

O Praticando Java: Challenge Conversor de Moedas simula um cenário comum em um mundo globalizado, onde conversões de moedas são necessárias para:

Compras internacionais

Freelancers que recebem em moedas estrangeiras

Viagens e planejamento financeiro

Plataformas e sites internacionais

O sistema foi desenvolvido para reforçar a importância da prática contínua no processo de aprendizado em programação.

⚙️ Funcionalidades

Menu interativo via console

Conversão de moedas com dados em tempo real

Mínimo de 6 opções de conversão, incluindo:

BRL → USD

USD → BRL

BRL → EUR

EUR → BRL

BRL → GBP

GBP → BRL

Consumo de API externa de câmbio

Desserialização de dados JSON utilizando Gson

Tratamento de entradas inválidas

Estrutura organizada seguindo Orientação a Objetos

🛠️ Tecnologias Utilizadas

Java (JDK 11 ou superior)

Programação Orientada a Objetos (POO)

Exchange Rate API (plano gratuito)

Gson

HTTP Client (java.net.http)

Git & GitHub

Trello (organização do desenvolvimento)

🔌 API Utilizada

O projeto utiliza a Exchange Rate API para obter cotações de moedas em tempo real.

Exemplo de endpoint:
https://v6.exchangerate-api.com/v6/SUA_API_KEY/pair/USD/BRL/100


⚠️ Importante:
A chave da API (API Key) deve ser gerada gratuitamente no site oficial e não deve ser versionada no repositório.

📦 Estrutura do Projeto
src/
 ├── app/
 │   └── Main.java
 ├── menu/
 │   └── Menu.java
 ├── service/
 │   ├── CurrencyConverterService.java
 │   └── ExchangeRateClient.java
 ├── model/
 │   └── ExchangeRateResponse.java
 ├── util/
 │   └── InputValidator.java
