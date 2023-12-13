# API Workshop
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Vitor221/workshop-springboot3-jpa/blob/main/LICENSE)

# Sobre o projeto

API Workshop é uma aplicação backend que foi construida durante o curso Java Completo 2023 Programação Orientada a Objetos do Nélio Alves no site da Udemy, [Curso Java](https://www.udemy.com/course/java-curso-completo/).

A aplicação consiste no gerenciamento dos produtos, usuários e pedidos. Podendo inserir, consultar, deletar ou atualizar os dados.

## Modelo conceitual
![Modelo Conceitual](https://github.com/Vitor221/assets/blob/main/domainModel.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- PostgreSQL
- JPA / Hibernate
- Maven

# Projeto em produção
- Site de hospedagem: Render
- Banco de dados: PostgreSQL

## URLs
- /users: https://workshop-0dhz.onrender.com/users
- /products: https://workshop-0dhz.onrender.com/products
- /orders: https://workshop-0dhz.onrender.com/orders
- /categories: https://workshop-0dhz.onrender.com/categories

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/Vitor221/workshop-springboot3-jpa

# construir o projeto
$ ./mvn clean package

# executar o projeto
$ java -jar target/course-0.0.1-SNAPSHOT.jar
```
A API poderá ser acessada em http://localhost:8080/.

## API Endpoints

- Criar Usuário
```bash
$ http POST :8080/users name="Vitor Eduardo" email="vitor@gmail.com" phone="11 9999999" password="1234"

[
  {
    "name": "Vitor Eduardo",
    "id": 1,
    "email": "vitor@gmail.com",
    "password": "1234",
    "phone": "11 999999"
  }
]
```
- Listar Usuários
```bash
$ http GET :8080/users

[
  {
    "name": "Vitor Eduardo",
    "id": 1,
    "email": "vitor@gmail.com",
    "password": "1234",
    "phone": "11 999999"
  }
]
```
- Atualizar Usuário
```bash
$ http PUT :8080/users/1 name="Vitor" email="eduardo@gmail.com" phone="11 9999999" password="1234"

[
  {
    "name": "Vitor",
    "id": 1,
    "email": "eduardo@gmail.com",
    "password": "1234",
    "phone": "11 999999"
  }
]
```
- Remover Usuário
```bash
$ http DELETE :8080/users/1

[]
```

# Autor

Vitor Eduardo Nascimento Orasio

https://www.linkedin.com/in/vitor-eduardo-52a295213/
