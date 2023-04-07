FROM eclipse-temurin:17

MAINTAINER bank.in

COPY target/LoanApplication-0.0.1-SNAPSHOT.jar LoanApplication-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","LoanApplication-0.0.1-SNAPSHOT.jar"]