//#!/usr/bin/env groovy

pipeline {

    agent {
        label('jenkins-slave-docker-node')
    }
    stages {
        stage('Compile') {
            steps {
                script {
                    sh "mvn clean compile"
                }
            }
        }
        stage('Unit Test') {
            steps {
                script {
                    sh "mvn test"
                }
            }
        }
        stage('package') {
            steps {
                script {
                    sh "mvn package"
                }
            }
        }
        stage('Install') {
            steps {
                script {
                    sh "mvn install"
                }
           }    
        }  
        stage('Execute') {
            steps {
                script {
                    sh "java -cp /tmp/workspace/docker-slave-sanchez/backend/target/:/tmp/workspace/docker-slave-sanchez/frontend/target/ -jar /tmp/workspace/docker-slave-sanchez/main/target/main-1.0.0-SNAPSHOT.jar"
                }
            }
        }
    }
}
