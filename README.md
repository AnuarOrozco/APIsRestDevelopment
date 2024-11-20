# API RESTful - Práctica de Creación con Buenas Prácticas

Esta aplicación es un ejemplo de una **API RESTful** desarrollada con Java y diseñada para practicar las buenas prácticas de construcción de APIs. El proyecto sigue una arquitectura limpia y modular para garantizar mantenibilidad, escalabilidad y claridad en el código.

## 📂 Estructura del Proyecto
El proyecto sigue una organización basada en responsabilidades claras:

- **`controller`**: Contiene los controladores REST que manejan las peticiones HTTP.  
  - **`dto`**: Define los Data Transfer Objects para estandarizar la entrada y salida de datos.  
- **`entities`**: Modelos de datos que representan las entidades del sistema.  
- **`persistence`**: Implementación de la lógica de persistencia, separada en un subpaquete `impl`.  
- **`repository`**: Define las interfaces que manejan la comunicación con la base de datos.  
- **`service`**: Contiene la lógica de negocio de la aplicación.

## 🚀 Funcionalidades
1. Implementación de operaciones CRUD para entidades.
2. Uso de buenas prácticas en el diseño de endpoints.
3. Separación entre entidades y DTOs para un manejo adecuado de los datos.
4. Persistencia con JPA y repositorios basados en interfaces.

## 🛠️ Tecnologías Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Lombok** (para reducir el boilerplate en el código)
- **Maven**

## 📋 Requisitos Previos
- Java 17 instalado.
- Maven configurado en tu sistema.
- (Opcional) Cliente REST como Postman o cURL para probar los endpoints.

## 🛣️ Endpoints Principales

### Product Endpoints
| Método | Endpoint                    | Descripción                                 |
|--------|-----------------------------|---------------------------------------------|
| GET    | /api/product/find/{id}       | Obtiene un producto por ID.                 |
| GET    | /api/product/findAll         | Obtiene todos los productos.               |
| POST   | /api/product/save            | Crea un nuevo producto.                    |
| PUT    | /api/product/update/{id}     | Actualiza un producto existente.           |
| DELETE | /api/product/delete/{id}     | Elimina un producto.                       |

### Maker Endpoints
| Método | Endpoint                    | Descripción                                 |
|--------|-----------------------------|---------------------------------------------|
| GET    | /api/maker/find/{id}         | Obtiene un fabricante por ID.               |
| GET    | /api/maker/findAll           | Obtiene todos los fabricantes.             |
| POST   | /api/maker/save              | Crea un nuevo fabricante.                  |
| PUT    | /api/maker/update/{id}       | Actualiza un fabricante existente.         |
| DELETE | /api/maker/delete/{id}       | Elimina un fabricante.                     |

## 🧪 Pruebas
- Usa un cliente REST (como Postman) para probar los endpoints.
- Verifica los logs en la consola para asegurarte de que se manejen correctamente los datos.

## 📄 Licencia
Este proyecto es de uso educativo y está bajo la Licencia MIT.

Desarrollado con ❤️ por **Anuar Avalos Orozco**.


