# Telecom Extension Management System

Sistema de Gestión de Extensiones Telefónicas
Sistema backend para administración de extensiones telefónicas, usuarios y departamentos en entornos empresariales.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.5-green)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## Características Principales

### Gestión de Extensiones

Creación, lectura, actualización y eliminación de extensiones

### Asignación de extensiones a usuarios

Validación de números y usuarios únicos

Estados de extensión (Activa, Inactiva, Bloqueada, Mantenimiento)

Tipos de extensión (SIP, IAX, Virtual, Fax, Conferencia)

### Gestión de Usuarios

CRUD completo de usuarios

Asignación de roles y departamentos

Historial de llamadas por usuario

Relación uno-a-uno con extensiones


---

## Seguridad

Autenticación JWT

Autorización por roles

Endpoints protegidos

CORS configurado

---

## Tecnologías Utilizadas

Backend: Java 17, Spring Boot 3.1.5

Base de datos: MySQL 8.0

ORM: Spring Data JPA, Hibernate

Seguridad: Spring Security, JWT

Documentación: SpringDoc OpenAPI 3

Logging: SLF4J con Log4j2

Dependencias: Lombok, MapStruct, Validation API

Testing: JUnit 5, Mockito

## Lisencia  

Este proyecto está licenciado bajo la Licencia MIT. Consulte el archivo LICENSE para más detalles.
