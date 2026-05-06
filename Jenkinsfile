pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn -B clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test -Dtest=OrangeHRM_Admin_User_Management_TC01.feature'
            }
        }
    }
}