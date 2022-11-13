FROM maven:3.8.4-jdk-8 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml -Dmaven.test.skip=true clean package

FROM openjdk:8-alpine
LABEL "Isa SAYAR"="isa.sayar1725@gmail.com"
COPY --from=build /usr/src/app/target/spring-argocd.jar /usr/app/spring-argocd.jar
EXPOSE 8100
ENTRYPOINT ["java","-jar","/usr/app/spring-argocd.jar"]
