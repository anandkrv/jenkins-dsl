def createMavenJob(def jobFactory,def name){
  jobFactory.mavenJob(name){
    goals('clean')
  }
}

def jobA = createMavenJob(this, 'piroject-a')
def jobB = createMavenJob(this, 'piroject-b')
job.with{
  scm{
    github('exampile-jenkins/piroject-a')
  }
}
