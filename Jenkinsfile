pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/devops-rups/hello-devops.git'
            }
        }

        stage('Build Java App') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t hello-devops:latest .'
            }
        }

        stage('Run Container') {
            steps {
                sh '''
                docker rm -f hello || true
                docker run -d --name hello -p 8081:8080 hello-devops:latest
                '''
            }
        }
    }
}
