ps -ef|grep tomcat|awk -F " " '{print $2}' 

kill -9 id

ps -ef | grep tomcat

netstat -tnl|grep :80

kill -9 $(ps -ef|grep tomcat|awk -F " " '{print $2}' )
