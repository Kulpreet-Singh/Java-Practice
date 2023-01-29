Employee Id: T2701
Name: Kulpreet Singh
-----------------------------------------------------------------------------
SpringBoot Project-1: Employee/Department Management Module

How to run:

Option 1: To run via command line (requires maven to be installed)
1. Change directory to the project folder i.e. springBoot1 using cd command
2. Run the command: mvn clean install
3. Run the command: java -jar target/springBoot1-SNAPSHOT.jar

Option 2: Using IntelliJ Idea or some other IDE
1. Open the project folder in your IDE
2. Reload the project using maven to install any dependencies
3. Run the project using the IDE
-------------------------------------------------------------------------------
Example Post Request for Department to localhost:8080/departments/

{
    "id": 1,
    "name": "oe",
    "description": "oe description",
    "strength": 135
}

Example Get Request for Department to localhost:8080/departments/

[
    {
        "id": 1,
        "name": "oe",
        "description": "oe description",
        "strength": 135
    },
    {
        "id": 2,
        "name": "techpg",
        "description": "techpg description",
        "strength": 115
    },
    {
        "id": 3,
        "name": "travel",
        "description": "travel description",
        "strength": 65
    }
]

Example Post request for employee to localhost:8080/departments/1/employees

{
    "id": 1,
    "name": "Kulpreet",
    "email": "ksingh_be18@thapar.edu",
    "dob": "2000-09-01",
    "role": "intern"
}

Example Get request for employee to localhost:8080/departments/1/employees


[
    {
        "id": 1,
        "name": "Kulpreet",
        "email": "ksingh_be18@thapar.edu",
        "dob": "2000-09-01",
        "age": 21,
        "role": "intern",
        "department": {
            "id": 1,
            "name": "oe",
            "description": "oe description",
            "strength": 135
        }
    },
    {
        "id": 2,
        "name": "Kulpreet Singh",
        "email": "Different ksingh_be18@thapar.edu",
        "dob": "2000-10-10",
        "age": 21,
        "role": "dev intern",
        "department": {
            "id": 1,
            "name": "oe",
            "description": "oe description",
            "strength": 135
        }
    }
]