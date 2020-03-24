pipeline {
    agent any

    stages {
        stage('Build') { 
            steps {
                bat 'mvn clean install' 
            }
        }
        stage('Test') { 
            steps {
                bat 'mvn test' 
            }
        } 
        stage('Package') { 
            steps {
                bat 'mvn  package' 
            }
        }
        stage('Build image') { 
            steps {
                bat 'docker build -f Dockerfile -t samjammoul/youonworkapi:api .' 
            }
        }
        stage('Push image') { 
            steps {
                bat 'docker push samjammoul/youonworkapi:api' 
            }
        }
        
       
    }
}