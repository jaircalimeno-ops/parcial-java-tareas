pipeline {
    agent any
    stages {
        stage('Compilar') {
            steps { bat 'mvn -B clean compile' }
        }
        stage('Pruebas') {
            steps { bat 'mvn -B test' }
        }
    }
    post {
        always { junit '**/target/surefire-reports/*.xml' }
    }
}
