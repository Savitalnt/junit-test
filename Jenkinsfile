pipeline {
agent any
    stages {
        stage('Checkout') {
            agent {label 'new-jenkins'}
            steps {
             checkout scm
            }
        }
      stage('Build & Test') {
            agent {label 'new-jenkins'}
            steps {
                  sh "mvn clean install"
              	  sh "mvn test"
            } 	 
            post{
            always{
              junit 'target/surefire-reports/*.xml'
            }
          }
      }
    stage('SonarQube analysis') {
      steps {
        withSonarQubeEnv('SonarServer') {
          sh 'mvn clean package sonar:sonar -Dsonar.projectName="Canvas DevOps Backend" -Dsonar.projectKey="infinitybackendv2"'
        }
      }
    }
   }
}
