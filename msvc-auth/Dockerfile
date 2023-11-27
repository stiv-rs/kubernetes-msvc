FROM openjdk:17-jdk-alpine as builder

WORKDIR /app/msvc-auth

COPY ./pom.xml /app
COPY ./msvc-auth/.mvn ./.mvn
COPY ./msvc-auth/mvnw .
COPY ./msvc-auth/pom.xml .

RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target/
#RUN ./mvnw dependency:go-offline //descarga todas las dependencias

COPY ./msvc-auth/src ./src

RUN ./mvnw clean package -DskipTests

FROM openjdk:17-jdk-alpine

WORKDIR /app

#RUN mkdir ./logs #copiar los logs a una carpeta en la maquina

COPY --from=builder /app/msvc-auth/target/msvc-auth-0.0.1-SNAPSHOT.jar .
EXPOSE 9000

ENTRYPOINT ["java","-jar","msvc-auth-0.0.1-SNAPSHOT.jar"]
#CMD ["java","-jar","msvc-auth-0.0.1-SNAPSHOT.jar"] #permite ingresar a la shell del contenedor