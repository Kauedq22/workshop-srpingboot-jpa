# Objetivos
- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções

## Setup
- Pré-requisitos: Java 11
- Certifique-se de ter o Java JDK e o Maven instalados.
- Postman

## Para acessar a tabela com comands SQL recomendado acessar:
  http://localhost:8080/h2-console/
- User : sa
- password : 

## Endpoints da API
- Para a manipulaçao de dados é recomendado a ultilação do Postman

### Método: GET
URL: http://localhost:8080/users
Listagem de todos os usuarios:

### Método: GET
URL: http://localhost:8080/products
Detalhes dos produtos relacionados a categoria

### Método: GET
URL: http://localhost:8080/categories
Mostra a categorias dos pedidos:

### Método: GET
URL: http://localhost:8080/orders
Listagem de todos os pedidos:

### Método: POST
URL: http://localhost:8080/users
Adiona novos usurios:

### Método: DELETE
URL: http://localhost:8080/users
Remove usuarios dejesados:
