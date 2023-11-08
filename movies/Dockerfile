# Utiliza una imagen base de OpenJDK
FROM openjdk:21

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR de tu aplicación Spring Boot al contenedor
COPY demo-movies.jar demo-movies.jar


# Expone el puerto en el que se ejecutará tu aplicación Spring Boot
EXPOSE 8080

# Comando de inicio para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "demo-movies.jar"]
