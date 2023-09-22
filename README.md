# Proyecto CRUD de Concesionario

Este proyecto es un sistema de gestión CRUD básico para un concesionario de coches. Permite listar, crear, actualizar y eliminar coches en el sistema.

## Tecnologías Utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Thymeleaf
- MySQL

## Configuración
## Base de Datos
Este proyecto está configurado para usar una base de datos MySQL. Aquí están las propiedades relevantes encontradas en `application.properties`:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/vehiculosdb
spring.datasource.username=user_coche
spring.datasource.password=admin1234
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=none

Deberás asegurarte de tener una base de datos MySQL disponible en localhost en el puerto 3306 y una base de datos llamada vehiculosdb. Las credenciales de acceso a la base de datos son user_coche como usuario y admin1234 como contraseña.

## Otras Propiedades

### SQL Logging:

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

Estas propiedades están habilitadas para mostrar las consultas SQL en la consola y formatearlas para mejorar la legibilidad.

### Puerto del Servidor:

server.port=8080

## Cómo Empezar
Para correr el proyecto localmente, sigue los pasos descritos a continuación:

### Requisitos
- Java 8 o superior
- Maven
- Un servidor de bases de datos compatible, como MySQL

### Pasos
1. Clona el repositorio a tu máquina local con `git clone [URL del repositorio]`.
2. Navega hasta el directorio del proyecto.
3. Ejecuta el comando `mvn spring-boot:run` para arrancar la aplicación.
4. Abre tu navegador web y visita `http://localhost:8080` para acceder a la aplicación.

## Ejemplos de Uso
A continuación se describen algunos ejemplos de uso básico de la aplicación:

### Listar Coches
Para ver la lista de coches, abre tu navegador y dirígete a: http://localhost:8080/

Aquí se mostrarán todos los coches disponibles en el sistema con opciones para editar o eliminar cada coche.

### Crear un Nuevo Coche
Para crear un nuevo coche:
1. Dirígete a: http://localhost:8080/coches/nuevo
2. Rellena el formulario con los detalles del coche: marca, modelo y matrícula.
3. Pulsa el botón "Guardar" para añadir el coche al sistema.

### Editar un Coche Existente
Para editar un coche existente:
1. Desde la lista de coches, selecciona "Editar" en el coche que deseas modificar.
2. Actualiza los detalles del coche en el formulario proporcionado.
3. Pulsa el botón "Actualizar" para guardar los cambios.

### Eliminar un Coche
Para eliminar un coche:
1. Desde la lista de coches, selecciona "Eliminar" en el coche que deseas remover.
2. Confirma la eliminación.


## Problemas y Soluciones
Si encuentras algún problema mientras utilizas la aplicación, por favor consulta la documentación de cada versión utilizada en sus respectivas páginas oficiales. Si no encuentras una solución allí, siéntete libre de abrir un nuevo "Issue" en el repositorio de GitHub del proyecto.

## Contribuciones
Si tienes sugerencias de mejoras o encuentras errores, no dudes en crear un "Pull Request".

