freeStyleJob('example-freestyleJob') {
    triggers {
      scm('H/1 * * * *')
    }
    stages {
           stage('first'){
             steps{
             sh '''
              whoami;hostname;hostname --ip-address;pwd
     				 '''
             }
           }
    stage('second'){
           steps{
             sh '''
               whoami;hostname;hostname --ip-address;pwd
     				'''
           }
      }
    }
}
