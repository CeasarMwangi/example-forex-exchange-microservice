		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>

# Important Spring Cloud Modules

## Dynamic Scale Up and Down. Using a combination of
Naming Server (Eureka)
Ribbon (Client Side Load Balancing)
Feign (Easier REST Clients)

## Visibility and Monitoring with
Zipkin Distributed Tracing
Netflix API Gateway

## Configuration Management with
Spring Cloud Config Server

## Fault Tolerance with
Hystrix

# Bootstrapping with Spring Initializr
Spring Initializr 
http://start.spring.io/
Spring Initializr is great tool to bootstrap your Spring Boot projects.

Import the project into Eclipse. 
File -> Import -> Existing Maven Project.


Forex Service (FS) is the Service Provider. 
It provides currency exchange values for various currency

Maven dependencies
Web
DevTools
Starter JPA
H2

SAMPLE REQUEST:
GET to http://localhost:8000/currency-exchange/from/EUR/to/INR

SAMPLE RESPONSE:
{
  id: 10002,
  from: "EUR",
  to: "INR",
  conversionMultiple: 75,
  port: 8000,
}

microservices talking to each other using Eureka Naming Server 
and Ribbon for Client Side Load Balancing.

Spring Boot
JPA Entity and Resource
Spring MVC
Spring Boot
JPA
Hibernate and 
H2 in memory database

How to use RestTemplate to execute a REST Service?
How to use Feign to execute a REST Service?
What are the advantages of Feign over RestTemplate?
























