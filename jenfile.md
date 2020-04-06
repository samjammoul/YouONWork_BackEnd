pipeline {
    agent any
    def app

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
        
        
        
       
    }
}