#!/usr/bin/env groovy

def imageId = "use-name/image-name:1.$BUILD_NUMBER"

pipeline {

    agent {
        label 'docker-slave'
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
                    sh "docker build --target final -t ${imageId} ."
                }
            }
        }
        stage('Install') {
            steps {
                script {
                    sh "docker build --target final -t ${imageId} ."
                }
            }
        }
    }
}
