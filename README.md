Sistema de Gestión de Extensiones Telefónicas
Sistema backend para administración de extensiones telefónicas, usuarios y departamentos en entornos empresariales.

https://img.shields.io/badge/Java-17-orange
https://img.shields.io/badge/Spring%2520Boot-3.1.5-green
https://img.shields.io/badge/MySQL-8.0-blue
https://img.shields.io/badge/License-MIT-yellow

Características Principales
Gestión de Extensiones
Creación, lectura, actualización y eliminación de extensiones

Asignación de extensiones a usuarios

Validación de números y usuarios únicos

Estados de extensión (Activa, Inactiva, Bloqueada, Mantenimiento)

Tipos de extensión (SIP, IAX, Virtual, Fax, Conferencia)

Gestión de Usuarios
CRUD completo de usuarios

Asignación de roles y departamentos

Historial de llamadas por usuario

Relación uno-a-uno con extensiones

Gestión Departamental
Organización por departamentos

Prefijos de extensión por departamento

Reportes por área

Seguridad
Autenticación JWT

Autorización por roles

Endpoints protegidos

CORS configurado

Tecnologías Utilizadas
Backend: Java 17, Spring Boot 3.1.5

Base de datos: PostgreSQL 15

ORM: Spring Data JPA, Hibernate

Seguridad: Spring Security, JWT

Documentación: SpringDoc OpenAPI 3

Logging: SLF4J con Log4j2

Herramientas: Lombok, MapStruct, Validation API

Testing: JUnit 5, Mockito
