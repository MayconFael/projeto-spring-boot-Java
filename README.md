# Projeto Spring Boot - API REST de Usuários

Este é um projeto de exemplo em Spring Boot que implementa uma API REST para gerenciar usuários. Ele utiliza o MongoDB como banco de dados e possui as seguintes funcionalidades:

- Cadastro, atualização, exclusão e consulta de usuários.
- Validação de email único.
- Controle de status do usuário.

O projeto utiliza as seguintes tecnologias e conceitos:

- Spring Boot
- Spring Data MongoDB
- Annotations para mapeamento de entidades e índices
- MongoDB como banco de dados NoSQL
- API RESTful com operações CRUD
- Validação de dados

## Funcionalidades

- Cadastro de um novo usuário com informações como nome, email, senha e status.
- Atualização dos dados de um usuário existente.
- Exclusão de um usuário pelo seu identificador.
- Consulta de um usuário pelo seu identificador.
- Consulta de todos os usuários cadastrados.

## Configuração e Execução

1. Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
2. Clone este repositório para o seu ambiente local.
3. Importe o projeto em sua IDE de preferência (Eclipse, IntelliJ, etc.).
4. Certifique-se de ter o MongoDB instalado e em execução.
5. Configure as propriedades de conexão com o MongoDB no arquivo `application.properties`.
6. Execute a classe `Application.java` para iniciar a aplicação Spring Boot.
7. Acesse a API REST em `http://localhost:8080/users`.

## Exemplos de Uso

### Cadastro de um novo usuário

