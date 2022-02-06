
pipeline {
    agent any

    stages {
        stage('build app') {
            steps {
                echo 'building app'
            }
        }
       
        stage('Test app') {
            steps {
                echo 'Testing app'
            }
        }
       
        stage('Deploy app') {
            steps {
                echo 'Deplying app'
            }
        }
    }
    
    post
    {
        always
        {
        emailext body: 'this is your pipeline status', subject: 'pipeline status', to: 'automationsandeep21@gmail.com'
            
        }
    }
}
