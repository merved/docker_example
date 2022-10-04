# devops_example

mvn clean package spring-boot:repackage

docker build -t docker-spring .

docker run --name spring-docker-cont -p 8080:8080 docker-spring -d

