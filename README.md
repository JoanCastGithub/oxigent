# Challenge Oxigent- ZARA
****
Create endpoint that retrieve one Tarif of the brand ZARA and maching according to the parameters passed in the path

***
## Table of Contents
1. [General info](#general-info)
2. [Technologies](#technologies)
3. [Installation](#installation)


## Table of Contents
<a name="general-info">General Info</a>

I decided to create the microservice in MVC architecture due to its simplicity. Currently microservices are created according to the hexagonal architecture. This one has the advantage of decoupling the business logic from its own third-party services. On the other hand, it generates duplication of entities, in addition to the complexity of implementation.

<a name="technologies">Technologies</a>
***
#### Technologie used within the project:
* [Java ](https://www.oracle.com/java/technologies/): Version 17
* [Spring Boot](https://spring.io/projects/spring-boot): Version 3.2.0-SNAPSHOT 
* [MapStruts](https://mapstruct.org/): Version 1.5.5.Fina
* [Maven](https://maven.apache.org/): Version  3.8.1

<a name="technologies">Installation</a>
#### Run this command. This is important to generate the mapper implementation. Those are generated inside target folder
```
$ mvn clean install -Dmaven.test.skip=true -U

