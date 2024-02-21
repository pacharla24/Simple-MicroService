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
        stage('Deploy') {
            steps {
                // Deploy the application (e.g., to a server)
                // This step depends on your deployment process
            }
        }
    }
}
