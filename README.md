# Progetto Automated Software Delivery

## Descrizione
Questo è un semplice progetto Java che permette di sommare due numeri inseriti dall'utente tramite input da tastiera.

## Requisiti
Per eseguire e compilare il progetto, assicurarsi di avere installati i seguenti strumenti:

- Java Development Kit (JDK) 21
- Apache Maven
- Docker 
- Docker Compose 

## Struttura del progetto

- **`pom.xml`**: File di configurazione di Maven che gestisce le dipendenze e i plugin.
- **`src/main/java/com/asd/Main.java`**: Classe principale.
- **`Dockerfile`**: Definisce l'immagine Docker per l'applicazione.
- **`docker-compose.yml`**: File per l'orchestrazione del container Docker.
- **`ci.yml`**: Pipeline di Continuous Integration con GitHub Actions.

## Compilazione ed esecuzione

### Con Maven
Per compilare ed eseguire il progetto localmente:
```sh
mvn clean install
java -jar target/asd-1.0-SNAPSHOT.jar
```

### Con Docker
Costruire l'immagine Docker:
```sh
docker build -t asd_app .
```
Eseguire il container:
```sh
docker run -it -p 8080:8080 asd_app
```

### Con Docker Compose
Avviare il servizio con:
```sh
docker-compose up
```

## Test
Per eseguire i test unitari:
```sh
mvn test
```
