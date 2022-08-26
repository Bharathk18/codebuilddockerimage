FROM openjdk:8
EXPOSE 8080
ADD target/codepipelineDockerImageEcr.jar codepipelineDockerImageEcr.jar
ENTRYPOINT ["java","-jar","/codepipelineDockerImageEcr.jar"]