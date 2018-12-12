----
STEPS :shipit:
----
1. clone de project 

2. execute  mvn clean install war:war

3. download https://www.payara.fish/software/downloads/all-downloads/  full version
* or download Payara Micro 5.184 (JAR)

4. unzip payara-5.184.zip 
* or execute $ java -jar payara-micro-5.184.jar --autoBindHttp --deploy target\microprofile-example.war
* Execute on the browser http://localhost:8081/microprofile-example/api/students and http://localhost:8081/microprofile-example/

5. in command console execute payara5\bin\ --> $ asadmin.bat start-domain

6. Excute in a browser http://localhost:4848

![Image of payara5](https://github.com/hhugohm/microprofile-service/blob/master/src/main/resources/payara.JPG)


7. application option --> deploy -->select a file (war) -->ok

8. Execute on the browser http://localhost:8080/microprofile-example/api/students and http://localhost:8080/microprofile-example/

![Image of rest service students](https://github.com/hhugohm/microprofile-service/blob/master/src/main/resources/students.JPG)


