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
                    sh "mvn package assembly:single"
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
    }
}
