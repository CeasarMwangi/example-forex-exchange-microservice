# Ribbon to distribute load between/among instances
load is automatically distribute

# Eureka as the naming server.
Microservices Auto discovery


		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>

# Hot wapping
The spring-boot-devtools module includes support for quick application restarts.

# JRebel https://zeroturnaround.com/software/jrebel/
## Stop redeploying and keep developing!
## Real-time change visibility
## Do more development, faster

NB:
Reload code changes instantly
JRebel fast tracks Java application development by skipping the time consuming build and redeploy steps in the development process. JRebel makes developers more productive since they can view code changes in real time.

	
java -jar -Dserver.port=9000 springboot-helloworld-0.0.1-SNAPSHOT.jar

1
mvn spring-boot:run -Drun.arguments="--server.port=9000"
java -Dserver.port=XXXX -jar <path/to/my/jar> --server.port=YYYY
java -jar <path/to/my/jar> --server.port=7788
server.port=8888


When spring boot application starts, the embedded server such as Tomcat starts with a default port. The embedded tomcat starts with 8080 port as default.
server:
  port: 9090 

# Using java Command with --server.port or -Dserver.port
Using --port
java -jar my-app.jar --port=8585 
Using -Dport
java -jar -Dport=8585 my-app.jar

# NB: Mostly springboot runs on port:8080 because of embedded Tomcat.

# Using application.properties
add server.port=9898

# On runtime config
## run your application with below arguments.
$ spring-boot:run -Drun.jvmArguments='-Dserver.port=8081'

java -Dserver.port=9090 -jar executable.jar

java -jar executable.jar –server.port=9090

# running it locally use

mvn spring-boot:run -Drun.jvmArguments='-Dserver.port=8085'



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

# Service Consumer
This Currency Conversion Service (CCS)(Service Consumer)
It uses the Forex Service to get current currency exchange values. CCS is the 

# Service Provider
Forex Service (FS) is the Service Provider. 
It provides currency exchange values for various currency

# Our Maven dependencies for Currency Conversion Service(Service Consumer)
Web
DevTools
Feign

SAMPLE REQUEST:
GET to http://localhost:8100/currency-converter/from/EUR/to/INR/quantity/10000

{
  id: 10002,
  from: "EUR",
  to: "INR",
  conversionMultiple: 75,
  quantity: 10000,
  totalCalculatedAmount: 750000,
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

# Ribbon
## enable client side load distribution using Ribbon.

CurrencyExchangeServiceProxy.java
This is the Feign Proxy to call the Forex Service.

What is the need for Load Balancing?
What is Ribbon?
How do you add Ribbon to your Spring Boot Project?
How do you enable and configure Ribbon to do Load Balancing?

Enabling Ribbon

Add Ribbon Dependency to pom.xml

    <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
    </dependency>
Enable RibbonClient in CurrencyExchangeServiceProxy

@FeignClient(name="forex-service")
@RibbonClient(name="forex-service")
public interface CurrencyExchangeServiceProxy {


# application.properties
forex-service.ribbon.listOfServers=localhost:8000,localhost:8001

# Launch up another Forex Service on port 8001
In the above step, we configured ribbon to distribute load to instances. 
We can launch an instance of Forex Service running on 8001 by configuring a launch configuration.

Right click project->Run as->Run configuration->Java Application->New->Arguments add below argumnents
--server.port=8001


# Ribbon in Action

Currently we have the following service up and running

Currency Conversion Micro Service (CCS) on 8100
Two instances of Forex MicroService on 8000 and 8001
Now you would see that the requests to CCS would get distributed between the two instances of Forex Microservice by Ribbon

Request 1
GET to http://localhost:8100/currency-converter-feign/from/EUR/to/INR/quantity/10000

{
  id: 10002,
  from: "EUR",
  to: "INR",
  conversionMultiple: 75,
  quantity: 10000,
  totalCalculatedAmount: 750000,
  port: 8000,
}
Request 2
GET to http://localhost:8100/currency-converter-feign/from/EUR/to/INR/quantity/10000

{
  id: 10002,
  from: "EUR",
  to: "INR",
  conversionMultiple: 75,
  quantity: 10000,
  totalCalculatedAmount: 750000,
  port: 8001,
}
You can see that the port numbers in the two responses are different.


What is the need for Naming Server?
What is Eureka?
How does Naming Server enable location transparancy between microservices?

# No hard coding url and port
When we create new instance of Forex Service, the consumer service
need to know automatically(no hard coded ip and port)
Eureka Naming Server help us to achieve this feature








