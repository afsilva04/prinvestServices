pipeline {
    agent any
    tools {
        gradle "gradle"
    }

    stages {
        stage('Clean Stage') {
            steps {
                sh 'gradle clean'
            }
        }

        stage('Build Stage') {
            steps {
                sh 'gradle build'
            }
        }

        stage('Test Stage') {
            steps {
                sh 'gradle test'
            }
        }
    }
}