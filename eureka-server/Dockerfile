FROM java:8-jre
MAINTAINER elviszhang <zhangb2002@163.com>

ADD ./target/eureka-server.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka-server.jar"]

EXPOSE 8761