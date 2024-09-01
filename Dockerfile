# 使用 Maven 安装依赖并构建应用
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .

COPY src ./src
RUN mvn package -DskipTests

# 使用 AdoptOpenJDK 17 作为基础镜像
#FROM adoptopenjdk/openjdk17:alpine
#WORKDIR /app
#COPY --from=build /app/target/user-center-backend-0.0.1-SNAPSHOT.jar /app/user-center-backend.jar
CMD ["java", "-jar", "user-center-backend-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]


#FROM maven:4.0.0-jdk-17-alpine as builder
#
#WORKDIR /app
#COPY pom.xml .
#COPY src ./src
#
#RUN mvn package -DskipTests
#
#CMD[]