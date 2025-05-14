pipeline{
   agent any
  stages{
    stage('update'){
      steps{
         sh 'sudo apt update' 
        }
      }
    stage('install-nginx'){
      steps {
         sh 'apt install nginx' 
        }
      }
    }
}
