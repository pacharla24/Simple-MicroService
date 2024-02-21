pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Checkout source code from version control
                checkout scm
                
                // Build the project using Maven
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run tests using Maven
                sh 'mvn test'
                
                // Archive test results
                junit '**/target/surefire-reports/*.xml'
            }
        }
        
    }
}
