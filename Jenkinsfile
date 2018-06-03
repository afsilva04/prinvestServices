pipeline {
    agent any
    tools {
        gradle "gradle"
    }

    stages {
        stage('build') {
            steps {
                sh 'gradle build'
            }
        }
    }
}