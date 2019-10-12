def gitUrl="https://github.com/quidryan/aws-sdk-test.git"
for(i in 0..10){
  job("DSL-Tutorial-1-Test${i}"){
    scm{
      git(gitUrl)
    }
    steps{
      maven("test -Dtest.suite=${i}")
    }
  }
}
