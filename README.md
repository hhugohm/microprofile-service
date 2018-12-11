----
STEPS
----
- clone de project 

- execute  mvn clean install war:war

- download https://www.payara.fish/software/downloads/all-downloads/  full version

- unzip payara-5.184.zip 

- in command console execute payara5\bin\asadmin --> $ asadmin.bat start-domain

- Excute in a browser http://localhost:4848

- application option --> deploy -->select a file (war) -->ok

- http://localhost:8080/microprofile-example/api/students and http://localhost:8080/microprofile-example/
