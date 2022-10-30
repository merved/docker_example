# docker_example

Docker deployment:

mvn clean package spring-boot:repackage

docker build -t docker-spring .

docker run --name spring-docker-cont -p 8080:8080 docker-spring -d


Kaniko with Jenkins pipeline:

   stage ('Build Image'){
        container('kaniko'){
                    script {
            sh '''
            /kaniko/executor --dockerfile `pwd`/Dockerfile --context `pwd` --destination="$docker_repository/$image_name:$version" --insecure --skip-tls-verify
             '''
          }
    }
		}
