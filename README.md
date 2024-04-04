

Spring Boot basic skeleton [Spring Initializr](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.2.4&packaging=jar&jvmVersion=17&groupId=com.sample&artifactId=app-features&name=app-features&description=Spring%20boot%20project%20to%20try%20different%20features&packageName=com.sample.app-features&dependencies=actuator,prometheus,web).

Enabled Spring Actuator and ran Prometheus locally by following the steps here:

Verified local steps:
- Prometheus - Run locally:
  ```
   ./prometheus --config.file=prometheus.yml
  ```
  Test Endpoints:
  - http://localhost:9090/graph
  - http://localhost:9090/metrics
- Actuator endpoint: http://localhost:8080/app_demo

- REST API:
  ```
  curl -X POST http://localhost:8080/users \
   -H "Content-Type: application/json" \
   -d '{"firstName": "dhoni", "email":"dhoni@test.com"}'

   curl -X GET http://localhost:8080/users/1 \
   -H "Content-Type: application/json"
  ```

Actuator References:
- https://github.com/BatuhanOrhon/actuator-demo-app
- https://batuhanorhon.medium.com/spring-boot-actuator-and-prometheus-with-an-example-application-90c88f7cc923

Map Struct References:
- https://auth0.com/blog/how-to-automatically-map-jpa-entities-into-dtos-in-spring-boot-using-mapstruct/
- https://reflectoring.io/java-mapping-with-mapstruct/
