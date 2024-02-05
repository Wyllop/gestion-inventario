# Aplicación de Gestión de Inventario

## Descripción General
Esta aplicación está diseñada para proporcionar una solución integral para la gestión de inventarios en pequeñas y medianas empresas. Permite a los usuarios añadir, editar, visualizar y eliminar productos, así como mantener un registro de la cantidad y categoría de los productos en el inventario. La aplicación está construida con Spring Boot y Java, ofreciendo una API REST para la manipulación de datos de productos.

## Características
- **Gestión de Productos**: Permite a los usuarios crear, actualizar y eliminar productos.
- **Visualización de Productos**: Los usuarios pueden ver la lista completa de productos disponibles en el inventario.
- **Categorización de Productos**: Organización de productos por categorías para una mejor gestión.
- **Interfaz de Usuario Intuitiva**: Front-end simple y amigable para la interacción con la base de datos de productos.

## Instalación
Para configurar este proyecto en tu entorno local, sigue estos pasos:

```bash
git clone https://github.com/usuario/gestion-inventario.git
cd gestion-inventario
````
## Referencia de la API

A continuación se presentan los endpoints de la API con sus respectivas operaciones:

    GET /api/productos/todos:
        Descripción: Recupera todos los productos.
        Respuesta: Array de objetos de productos.

    POST /api/productos/guardar:
        Descripción: Crea un nuevo producto.
        Cuerpo de la solicitud: Objeto de producto (sin ID).
        Respuesta: Producto guardado con ID asignado.

    PUT /api/productos/modificar/{id}:
        Descripción: Actualiza un producto existente por ID.
        Cuerpo de la solicitud: Objeto de producto con modificaciones.
        Respuesta: Producto actualizado.

    DELETE /api/productos/eliminar/{id}:
        Descripción: Elimina un producto por ID.
        Respuesta: Mensaje de confirmación de eliminación.

## Modelos

El modelo principal de la aplicación es Producto, que tiene los siguientes campos:

    id: Identificador único del producto.
    nombre: Nombre descriptivo del producto.
    precio: Precio unitario del producto.
    cantidad: Cantidad en stock del producto.
    categoria: Categoría asignada al producto.

## Configuración

El archivo CorsConfig.java contiene la configuración de CORS necesaria para permitir o restringir las solicitudes cruzadas en la aplicación. Por defecto, se permite el acceso desde cualquier origen para facilitar el desarrollo y las pruebas.
