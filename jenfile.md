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
        stage('Build Docker Image') { 
            steps {
                bat 'docker build -f Dockerfile -t youonwork .' 
            }
        }
        
        
       
    }
    }
