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
        stage('Build image') { 
           app = docker.build("samjammoul/youonworkapi")
        }
        stage('Push image') {
        
           docker.withRegistry('https://registry.hub.docker.com','dockerlogin')
           
        
           app.push("samjammoul/youonworkapi")
           app.push("latest")
        }
        
        
       
    }
}