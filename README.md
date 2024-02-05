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



## Descripción del front-end

Este proyecto es una interfaz de usuario web para una aplicación de gestión de inventario. Permite a los usuarios visualizar, añadir, editar y eliminar productos de un inventario a través de una API RESTful.

## Estructura del Proyecto

El proyecto se compone de un archivo HTML (`index.html`) que estructura la interfaz de usuario y un archivo JavaScript (`main.js`) que maneja las interacciones del usuario y las solicitudes a la API.

### `index.html`

El archivo `index.html` define la estructura de la página web y carga los recursos necesarios. Se utiliza Bootstrap para el diseño y estilos de la página. La interfaz consta de una barra de navegación, una tabla para mostrar los productos y un formulario para añadir o editar productos.

### `main.js`

El archivo `main.js` contiene la lógica para interactuar con la API del backend. Define las funciones para listar los productos, guardar un nuevo producto, eliminar un producto y editar la información de un producto existente.

## Características

- **Listar Productos**: Muestra todos los productos existentes en el inventario.
- **Añadir Producto**: Permite ingresar nuevos productos al inventario.
- **Editar Producto**: Habilita la edición de la información de productos existentes.
- **Eliminar Producto**: Permite remover productos del inventario.

## Uso

Para utilizar la aplicación, el usuario debe:

1. Abrir el archivo `index.html` en un navegador web.
2. Interactuar con la interfaz para añadir, editar o eliminar productos.
3. Las acciones realizadas en la interfaz se reflejarán en el servidor a través de la API.

## Funciones de JavaScript

- `list()`: Recupera y muestra la lista de productos.
- `save()`: Guarda un nuevo producto en el inventario.
- `deleteProducto()`: Elimina un producto existente.
- `rellenarProducto()`: Rellena el formulario con los datos de un producto para su edición.
- `editAlumno()`: Actualiza la información de un producto.
- `reset()`: Limpia los campos del formulario.

## Dependencias

- [Bootstrap](https://getbootstrap.com/): Utilizado para los estilos y componentes de la interfaz.
- [jQuery](https://jquery.com/): Utilizado para facilitar las solicitudes AJAX y la manipulación del DOM.

![imagen](https://github.com/Wyllop/gestion-inventario/assets/118977401/f3ee1f60-641d-43b6-90be-f72d1c12af26)
![imagen](https://github.com/Wyllop/gestion-inventario/assets/118977401/a1a8338d-c2ce-4e2f-b900-75843dfac272)




