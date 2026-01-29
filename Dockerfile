FROM tomcat:9.0
COPY target/hello-devops.war /usr/local/tomcat/webapps/ROOT.war
