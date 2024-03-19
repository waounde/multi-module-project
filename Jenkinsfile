#!/usr/bin/env groovy

pipeline {
    agent {
        label('jenkins-slave-docker-node')
    }
    stages {
        stage('Compile') {
            steps {
                script {
                    // Compile le projet avec Maven
                    sh "mvn clean compile"
                }
            }
        }
        stage('Unit Test') {
            steps {
                script {
                    // Exécute les tests unitaires avec Maven
                    sh "mvn test"
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    // Crée le package JAR avec Maven (avec toutes les dépendances incluses)
                    sh "mvn package assembly:single"
                }
            }
        }
        stage('Install') {
            steps {
                script {
                    // Installe le package dans le dépôt local Maven
                    sh "mvn install"
                }
            }
        }
        stage('Execute') {
            steps {
                script {
                    // Exécute le JAR généré avec toutes les dépendances
                    sh "java -jar /tmp/workspace/docker-jenkons/main/target/backend-1.0.0-SNAPSHOT.jar"
                }
            }
        }
    }
}
