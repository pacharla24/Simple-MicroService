pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Execute your build commands here
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Execute your testing commands here
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Execute your deployment commands here
                sh 'ansible-playbook deploy.yml'
            }
        }
    }

    post {
        success {
            // Actions to perform if the pipeline succeeds
            echo 'Pipeline succeeded!'

            // Example: Send notification email
            emailext (
                subject: "Pipeline Success: ${env.JOB_NAME}",
                body: "Pipeline ${env.JOB_NAME} has successfully completed.",
                to: 'pacharlahemanthkumar03@gmail.com'
            )
        }
        failure {
            // Actions to perform if the pipeline fails
            echo 'Pipeline failed!'

            // Example: Send notification email
            emailext (
                subject: "Pipeline Failure: ${env.JOB_NAME}",
                body: "Pipeline ${env.JOB_NAME} has failed.",
                to: 'pacharlahemanthkumar03@gmail.com'
            )
        }
    }
}
