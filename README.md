Título: API de Productos y Makers

Descripción: Esta API proporciona una interfaz para gestionar productos y makers (fabricantes). Permite crear, leer, actualizar y eliminar (CRUD) productos y makers.

Endpoints:

- Productos:
    - GET /api/product/findAll: Obtener lista de productos
    - GET //api/product/find/{id}: Obtener producto por ID
    - POST /api/product/save: Crear nuevo producto
    - PUT /api/product/update/{id}: Actualizar producto
    - DELETE /api/product/delete/{id}: Eliminar producto
    - GET /api/product/price-range: Obtener productos dentro de un rango de precios
        - Parámetros:
            - minPrice: Precio mínimo del rango
            - maxPrice: Precio máximo del rango
- Makers:
    - GET /api/maker/findAll: Obtener lista de makers
    - GET /api/maker/find/{id}: Obtener maker por ID
    - POST /api/maker/save: Crear nuevo maker
    - PUT /api/maker/update/{id}: Actualizar maker
    - DELETE /api/maker/delete/{id}: Eliminar maker

Parámetros y Cuerpo de la Solicitud:

- Los parámetros y el cuerpo de la solicitud variarán según el endpoint y el método utilizado. Consulta la documentación de cada endpoint para obtener más información.

Respuestas:

- Las respuestas serán en formato JSON y contendrán la información solicitada o un mensaje de error.

Tecnologías Utilizadas:

- Spring Boot
- Java 17
- JPA
- MYSQL
- Hibernate
  
