FROM bellsoft/liberica-openjdk-alpine:11.0.8-10
COPY . /opt/planner
CMD java -Dspring.profiles.active=docker -jar /opt/planner/app-core.jar
