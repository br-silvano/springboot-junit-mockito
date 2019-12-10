pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2'
            args '-v $HOME/tools:/var/lib/jenkins/tools' 
        }
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
