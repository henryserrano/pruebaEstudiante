Gestión de Estudiantes
Esta aplicación es un servicio REST para gestionar estudiantes utilizando Spring Boot, MapStruct y Lombok. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los datos de los estudiantes.

Tecnologías Utilizadas
Spring Boot: Framework para desarrollar aplicaciones Java basadas en Spring.
MapStruct: Biblioteca para el mapeo entre objetos Java.
Lombok: Biblioteca para reducir el código boilerplate en Java.
H2 Database: Base de datos en memoria para pruebas.
Requisitos
Java 11 o superior
Maven o Gradle para la gestión de dependencias
Instalación
Clonación del Repositorio
git clone https://github.com/tu-usuario/gestion-estudiantes.git
cd gestion-estudiantes
Ejecución
Para ejecutar la aplicación, usa el siguiente comando:

Para Maven:
mvn spring-boot:run
La aplicación se ejecutará en http://localhost:8080 por defecto.

Endpoints
La API REST ofrece los siguientes endpoints para la gestión de estudiantes:

GET /estudiantes: Obtiene la lista de todos los estudiantes.
GET /estudiantes/{id}: Obtiene un estudiante por su ID.
POST /estudiantes: Crea un nuevo estudiante.
DELETE /estudiantes/{id}: Elimina un estudiante por su ID.
