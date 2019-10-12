def branches = ['master','feature']
branches.each { branch ->
  job("jenkins-${branch}"){
    scm{
      github('jenkins/jendsl',branch)
    }
  }
}
