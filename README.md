----
STEPS :shipit:
----
1. clone de project 

2. execute  mvn thorntail:run

3. Execute on the browser 
* http://localhost:8080/microprofile-example/api/students 
* http://localhost:8080/microprofile-example/
--
![Image of rest service students](https://github.com/hhugohm/microprofile-service/blob/master/src/main/resources/students.JPG)

4. If you need a process kill because the 8080 port is busy execute:
* netstat -ano | findstr :8080
* taskkill /PID NO_PROCESS /F
*
![Image of busy port](https://github.com/hhugohm/microprofile-service/blob/microprofile-thorntail/src/main/resources/kill_process.JPG)




