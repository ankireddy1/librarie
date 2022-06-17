
def newGit(repo)
{
  git "${repo}"
}
def Maven()
{
  sh 'mvn package'
}
def Deploy(jobname,ip,app)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${app}.war"
}
def Test()
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
