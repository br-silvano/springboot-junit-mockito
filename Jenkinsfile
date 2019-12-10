pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') {
            tools {
                jdk "jdk13"
            }
            steps {
                sh './mvnw install -DskipTests=true -Dmaven.javadoc.skip=true -B -V' 
            }
        }
        stage('Test') {
            tools {
                jdk "jdk13"
            }
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
            tools {
                jdk "jdk13"
            }
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}
