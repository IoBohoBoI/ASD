# Usa un'immagine di base con JDK 23 dal Docker Hub
FROM openjdk:21

# Imposta la directory di lavoro
WORKDIR /app

# Copia il file JAR dell'app
COPY target/asd-1.0-SNAPSHOT.jar app.jar

# Espone la porta dell'applicazione
EXPOSE 8080

# Comando per eseguire l'app
CMD ["java", "-jar", "app.jar"]
