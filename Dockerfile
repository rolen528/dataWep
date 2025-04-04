# Base image: OpenJDK 17
FROM openjdk:17-jdk-alpine

# 작업 디렉토리 설정
WORKDIR /app

# Gradle 빌드 결과물 복사 (Gradle은 build/libs에 생성됨)
COPY build/libs/*.jar app.jar

# 애플리케이션 리소스 복사 (application.yml 등)
COPY src/main/resources/application.yml application.yml
COPY src/main/resources/ /app/src/main/resources/

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
