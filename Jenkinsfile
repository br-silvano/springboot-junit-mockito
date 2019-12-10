pipeline {
    agent any
    tools {
        jdk 'jdk13'
        maven 'maven3'
    }
    stages {
        stage('Build') {
            steps {
                sh './mvnw install -DskipTests=true -Dmaven.javadoc.skip=true -B -V' 
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}
