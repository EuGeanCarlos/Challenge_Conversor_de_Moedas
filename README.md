# Conversor de moedas — protótipo de console

Menu Java com seis pares BRL/USD/EUR/GBP e validação de entradas. Usa taxa fixa simulada de 1,23; não consulta API nem fornece cotações reais.

## Tecnologias

- Java
- Scanner

## Funcionalidades e utilização

Escolha 1 e informe 10: a simulação produz 12,30 USD. Digite 0 para sair.

## Como executar

```bash
git clone https://github.com/EuGeanCarlos/Challenge_Conversor_de_Moedas.git
cd Challenge_Conversor_de_Moedas
javac -encoding UTF-8 -d out src/Main.java
java -cp out Main
```

Requer JDK 17 ou superior. Os exercícios executam no terminal.

## Demonstração e publicação

Execução local. Nenhuma demonstração nova foi confirmada nesta etapa.

GitHub Pages hospeda arquivos estáticos e não executa Java, Node.js, PHP ou Python. As dependências de servidor deste projeto devem ser executadas em ambiente apropriado.

## Estrutura versionada

```text
.gitignore
Challenge_Conversor_de_Moedas.iml
README.md
src/Main.java
```

## Status

Protótipo / projeto de estudo em desenvolvimento. A descrição acima distingue o que está implementado das dependências ou etapas pendentes.

## Autor e créditos

**Gean Carlos** — estudante de Engenharia de Computação, UEMA.

[GitHub](https://github.com/EuGeanCarlos)

Licenças, autoria compartilhada e atribuições existentes no código e nos materiais originais permanecem aplicáveis.

## Validação desta auditoria — 14/10/2026

Sem publicação nova confirmada. Compilação e execução aprovadas: opção 1 e valor 10 usam taxa simulada 1,23, retornando 12,30 USD. Não há consulta real de câmbio.
