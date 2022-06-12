
# Running Spring Boot with PostgreSQL in Docker Compose

Este projeto tem o objetivo de servir como um guia para o processo de construção de uma aplicação Spring Boot com PostgreSQL sendo orquestrado pelo Docker Compose.

## O que você precisa para rodar este projeto

- Java 17
- Docker



## Setup

- Ubuntu  Ubuntu 22.04 (LTS).
- arquitetura: x86_64 

## build

```sh
./mvnw clean package -DskipTests
```
```sh
docker build -t emersonrc/docker-spring-boot-postgres .
```
```sh
docker-compose up -d
```
