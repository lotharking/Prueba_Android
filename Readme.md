## Lista de deseos
Este proyecto utiliza Gradle como sistema de construcción, Java Spring Boot para el backend y Angular para el frontend. La aplicación se centra en proporcionar una interfaz web para que los usuarios gestionen sus listas de deseos.

## Estructura del Proyecto
El proyecto se organiza de la siguiente manera:

### Backend
#### Authentication
##### Arquitecture
src
|-- main
|   |-- java
|       |-- com
|           |-- yourcompany
|               |-- yourproject
|                   |-- application
|                       |-- UserApplicationService.java
|                   |-- domain
|                       |-- model
|                           |-- User.java
|                       |-- repository
|                           |-- UserRepository.java
|                       |-- service
|                           |-- UserService.java
|                   |-- infrastructure
|                       |-- adapter
|                           |-- UserController.java
|                           |-- UserRepositoryAdapter.java
|                       |-- configuration
|                           |-- ApplicationConfig.java
|                   |-- Application.java
|-- resources
|   |-- application.properties

### Frontend

## Configuración de la Base de Datos
Los datos necesarios para la creación de la base de datos se encuentran en el archivo data.sql. Para facilitar la creación automática, se ha configurado el proyecto con las siguientes propiedades en application.properties
```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.initialization-mode=always
```
En caso de que la base de datos no se cree automáticamente, puede cambiar la propiedad `spring.jpa.hibernate.ddl-auto` a create, comentar la línea `spring.datasource.initialization-mode=always`, compilar el proyecto y luego devolverlo a update para iniciar su ejecución.

### Configuración de Versiones
Este proyecto fue construido con las siguientes versiones:

- Java: 17.0.8
- Gradle: 7.3
- Angular: 13.0.2

### Ejecución del Proyecto
#### Backend (Spring Boot)
Asegúrese de tener Java 17 y Gradle 7.3 instalados. Desde la carpeta raíz del proyecto, ejecute el siguiente comando para iniciar el backend:
```bash
gradle bootRun
```

#### Frontend (Angular)
Asegúrese de tener Node.js y npm instalados. Navegue a la carpeta frontend desde la raíz del proyecto y ejecute los siguientes comandos:
```bash
npm install
npm run start
```
Con estos pasos, debería poder ejecutar tanto el backend como el frontend de su proyecto de Lista de Deseos. ¡Disfruta desarrollando!

### Notas Adicionales
- Asegúrese de tener las dependencias necesarias especificadas en el archivo `build.gradle`.
- Este proyecto utiliza Gradle como sistema de construcción, asegúrese de tenerlo instalado.

Con esta estructura y configuración, deberías estar listo para comenzar con tu proyecto de Lista de Deseos utilizando Java Spring Boot y Angular. ¡Buena suerte!