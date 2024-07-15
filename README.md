# Foro Hub

Foro Hub es una API REST diseñada para simular diversos endpoints de un foro, incluyendo funcionalidades como el inicio de sesión y registro de usuarios, la creación, actualización y eliminación lógica de tópicos en una base de datos. Este proyecto es parte del programa de formación Alura Latam ONE (Oracle Next Education).

# ¿Cómo funciona?

Esta aplicación emplea el Spring Framework para la creación y seguridad de los endpoints, y JWT para la autenticación de usuarios. Una vez que un usuario envía una petición de inicio de sesión a la ruta correspondiente, puede acceder a los métodos relacionados con los tópicos, tales como consultar, crear, actualizar y eliminar.
Cada tópico creado por los usuarios se almacena en una base de datos MySQL. Al consultar o actualizar un tópico, se muestra el nombre del autor de la creación o actualización. Finalmente, un usuario puede eliminar un tópico, pero para mantener la integridad de la base de datos y la persistencia de los datos, esta eliminación se realiza solo de manera lógica.

# Tecnologías implementadas:

- Spring Framework
- Java
- Maven
- Flyway
- MySQL
- Lombok
- Spring Data JPA
- Swagger
