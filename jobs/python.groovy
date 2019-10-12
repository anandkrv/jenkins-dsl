project_name="python-pippeline"
repo="git@github.com:videocursoscloud/test-jenkins-1.git"
repo_name="repo-python"

pipelineJob(project_name) {
  definition{
    triggers{
      scm('H/1 * * * *')
    }
    cpsScm{
      scm{
        git{
          remote{
          name(repo_name)
          url(repo)
          }
        }
        ScriptPath("Jenkinsfile")
      }
    }
  } 
}

