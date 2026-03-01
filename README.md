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

Dependencias: Lombok, MapStruct, Validation API, java-asterisk

Testing: JUnit 5, Mockito

## Lisencia

Este proyecto está licenciado bajo la Licencia MIT. Consulte el archivo [LICENSE](LICENSE) para más detalles.

---

## Uso de hooks locales y CI (formateo y linter)

Se han añadido hooks de pre-commit y plugins Maven para formateo (`spotless`) y comprobación (`checkstyle`). A continuación las instrucciones para usarlos y probarlos.

- Activar hooks (Windows PowerShell):

```powershell
# desde la raíz del repositorio
.\scripts\install-git-hooks.ps1
```

- Activar hooks (Unix / Git Bash):

```sh
git config core.hooksPath .githooks
```

- Probar manualmente las comprobaciones y aplicar formato:

```sh
# aplica formato y lanza checkstyle (no hace tests)
mvn -q -DskipTests=true spotless:apply checkstyle:check
```

- Qué hace el hook de pre-commit:
  - Ejecuta `spotless:apply` y `checkstyle:check`. Si `checkstyle` falla, el commit se aborta.
