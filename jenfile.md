pipeline { 
   agent {
           docker {
               image 'samjammoul/openjdk11:jdk-11.0.2.9'
               args '--network ci'
           }
       } 
    stages { 
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
         stage('Test') {
            steps {
                sh './gradlew check'
            }
        }
    }
    post {
        always {
            junit 'build/reports/**/*.xml'
        }
    }
}
