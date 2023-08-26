FROM maven:3.8.4-jdk-8 AS build
COPY . /usr/src/app
RUN mvn --batch-mode -f /usr/src/app/pom.xml clean package

FROM openjdk:8-alpine
LABEL "Isa SAYAR"="isa.sayar1725@gmail.com"
COPY --from=build /usr/src/app/target/spring-argocd.jar /usr/app/spring-argocd.jar
ENV PORT 8100
EXPOSE 8100
ENTRYPOINT ["java","-jar","/usr/app/spring-argocd.jar"]
