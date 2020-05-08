FROM alpine/git as clone
WORKDIR /usr/src
RUN git clone https://github.com/Bibek-Sutradhar/AttractionService.git


FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /usr/src/AttractionService/AttractionService /app
RUN mvn install


FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8888
COPY --from=build /app/target/AttractionService-1.0.jar /app
CMD ["java", "-jar", "AttractionService-1.0.jar"]
