FROM openjdk:17
EXPOSE 9292
ADD build/libs/Employeemanagment-0.0.1-SNAPSHOT.jar Employeemanagment-0.0.1-SNAPSHOT
ENTRYPOINT [ "java","-jar","/Employeemanagment-0.0.1-SNAPSHOT" ]