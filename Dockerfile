FROM tomcat:9.0
COPY target/hello-devops-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

