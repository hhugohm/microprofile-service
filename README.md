----
STEPS :shipit:
----
1. clone de project 

2. execute  mvn clean install war:war

3. download https://www.payara.fish/software/downloads/all-downloads/  full version

4. unzip payara-5.184.zip 

5. in command console execute payara5\bin\asadmin --> $ asadmin.bat start-domain

6. Excute in a browser http://localhost:4848

7. application option --> deploy -->select a file (war) -->ok

8. Execute on the browser http://localhost:8080/microprofile-example/api/students and http://localhost:8080/microprofile-example/
