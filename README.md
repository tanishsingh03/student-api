# Java Spring Boot Interview Questions and Answers

Welcome! This repository contains a structured, detailed, and easy-to-understand guide for Spring Boot interview preparation, ranging from basic concepts to advanced enterprise architectural topics.

### Table of Contents

<details open>
<summary>
Hide/Show table of contents
</summary>

| No. | Questions |
| --- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|     | **Basic Questions** |
| 1   | [What is Spring Boot?](#what-is-spring-boot) |
| 2   | [What are the advantages of Spring Boot?](#what-are-the-advantages-of-spring-boot) |
| 3   | [What are the main features of Spring Boot?](#what-are-the-main-features-of-spring-boot) |
| 4   | [What are the differences between Spring and Spring Boot?](#what-are-the-differences-between-spring-and-spring-boot) |
| 5   | [How does Spring Boot simplify development?](#how-does-spring-boot-simplify-development) |
| 6   | [How to create a Spring Boot application using Maven?](#how-to-create-a-spring-boot-application-using-maven) |
| 7   | [How to create a Spring Boot project using Spring Initializer?](#how-to-create-a-spring-boot-project-using-spring-initializer) |
| 8   | [How do you create a simple Spring Boot application?](#how-do-you-create-a-simple-spring-boot-application) |
| 9   | [What are Spring Boot Starters?](#what-are-spring-boot-starters) |
| 10  | [What is the use of the @SpringBootApplication annotation?](#what-is-the-use-of-the-springbootapplication-annotation) |
| 11  | [What is the Spring Initializr?](#what-is-the-spring-initializr) |
| 12  | [What are the Spring Boot annotations?](#what-are-the-spring-boot-annotations) |
| 13  | [What is Spring Boot dependency management?](#what-is-spring-boot-dependency-management) |
| 14  | [What are the Spring Boot properties?](#what-are-the-spring-boot-properties) |
| 15  | [What is Spring Boot Actuator?](#what-is-spring-boot-actuator) |
| 16  | [How to connect Spring Boot to the database using JPA?](#how-to-connect-spring-boot-to-the-database-using-jpa) |
| 17  | [How to connect Spring Boot application to a database using JDBC?](#how-to-connect-spring-boot-application-to-a-database-using-jdbc) |
| 18  | [What is @RestController annotation in Spring Boot?](#what-is-restcontroller-annotation-in-spring-boot) |
| 19  | [What is @RequestMapping annotation in Spring Boot?](#what-is-requestmapping-annotation-in-spring-boot) |
| 20  | [How does Spring Boot simplify dependency management?](#how-does-spring-boot-simplify-dependency-management) |
| 21  | [What is the role of embedded servers in Spring Boot?](#what-is-the-role-of-embedded-servers-in-spring-boot) |
| 22  | [What are Profiles in Spring Boot?](#what-are-profiles-in-spring-boot) |
|     | **Intermediate Questions** |
| 1   | [What are the basic Spring Boot annotations?](#what-are-the-basic-spring-boot-annotations) |
| 2   | [Is it possible to change the port of the embedded Tomcat server in Spring Boot?](#is-it-possible-to-change-the-port-of-the-embedded-tomcat-server-in-spring-boot) |
| 3   | [What is the starter dependency of the Spring Boot module?](#what-is-the-starter-dependency-of-the-spring-boot-module) |
| 4   | [What is the default port of Tomcat in Spring Boot?](#what-is-the-default-port-of-tomcat-in-spring-boot) |
| 5   | [Can we disable the default web server in the Spring Boot application?](#can-we-disable-the-default-web-server-in-the-spring-boot-application) |
| 6   | [How to disable a specific auto-configuration class?](#how-to-disable-a-specific-auto-configuration-class) |
| 7   | [Can we create a non-web application in Spring Boot?](#can-we-create-a-non-web-application-in-spring-boot) |
| 8   | [Explain @RestController annotation in Spring Boot.](#explain-restcontroller-annotation-in-spring-boot) |
| 9   | [Difference between @Controller and @RestController?](#difference-between-controller-and-restcontroller) |
| 10  | [What is the difference between RequestMapping and GetMapping?](#what-is-the-difference-between-requestmapping-and-getmapping) |
| 11  | [What are Profiles in Spring Boot?](#what-are-profiles-in-spring-boot) |
| 12  | [How do you enable Actuator in the Spring Boot application?](#how-do-you-enable-actuator-in-the-spring-boot-application) |
| 13  | [How do you handle exceptions in a Spring Boot application?](#how-do-you-handle-exceptions-in-a-spring-boot-application) |
| 14  | [What is Swagger in Spring Boot?](#what-is-swagger-in-spring-boot) |
| 15  | [How do you implement security in a Spring Boot application?](#how-do-you-implement-security-in-a-spring-boot-application) |
| 16  | [What are the different ways to configure Spring Boot applications?](#what-are-the-different-ways-to-configure-spring-boot-applications) |
| 17  | [What is Spring Data JPA, and how does it differ from Hibernate?](#what-is-spring-data-jpa-and-how-does-it-differ-from-hibernate) |
| 18  | [How do you use Spring Boot with Docker?](#how-do-you-use-spring-boot-with-docker) |
| 19  | [What is the difference between @Component, @Service, and @Repository annotations?](#what-is-the-difference-between-component-service-and-repository-annotations) |
| 20  | [How do you test RESTful services in Spring Boot?](#how-do-you-test-restful-services-in-spring-boot) |
| 21  | [How do you configure multiple data sources in Spring Boot?](#how-do-you-configure-multiple-data-sources-in-spring-boot) |
| 22  | [What is the purpose of the @Autowired annotation?](#what-is-the-purpose-of-the-autowired-annotation) |
| 23  | [How do you handle CORS in Spring Boot?](#how-do-you-handle-cors-in-spring-boot) |
|     | **Advanced Questions** |
| 1   | [What are the annotations used to create an Interceptor in Spring Boot?](#what-are-the-annotations-used-to-create-an-interceptor-in-spring-boot) |
| 2   | [What is the purpose of Swagger in Spring Boot?](#what-is-the-purpose-of-swagger-in-spring-boot) |
| 3   | [What are the differences between Spring Data JPA and Hibernate?](#what-are-the-differences-between-spring-data-jpa-and-hibernate) |
| 4   | [How do you use Spring Boot with Docker?](#how-do-you-use-spring-boot-with-docker) |
| 5   | [How to implement caching in Spring Boot?](#how-to-implement-caching-in-spring-boot) |
| 6   | [How to configure Spring Boot for asynchronous processing?](#how-to-configure-spring-boot-for-asynchronous-processing) |
| 7   | [How do you configure multiple data sources in Spring Boot?](#how-do-you-configure-multiple-data-sources-in-spring-boot) |
| 8   | [What is the purpose of @ComponentScan in the class files?](#what-is-the-purpose-of-componentscan-in-the-class-files) |
| 9   | [How to monitor a Spring Boot application using Actuator?](#how-to-monitor-a-spring-boot-application-using-actuator) |
| 10  | [How do you implement distributed tracing in a Spring Boot application using OpenTelemetry?](#how-do-you-implement-distributed-tracing-in-a-spring-boot-application-using-opentelemetry) |
| 11  | [How do you enable HTTPS in a Spring Boot application?](#how-do-you-enable-https-in-a-spring-boot-application) |
| 12  | [What is Spring Boot WebFlux?](#what-is-spring-boot-webflux) |
| 13  | [What is reactive programming in Spring Boot?](#what-is-reactive-programming-in-spring-boot) |
| 14  | [How do you deploy a Spring Boot application as a WAR file?](#how-do-you-deploy-a-spring-boot-application-as-a-war-file) |
| 15  | [How do you integrate Spring Boot with RabbitMQ?](#how-do-you-integrate-spring-boot-with-rabbitmq) |
| 16  | [How do you configure a data source in Spring Boot?](#how-do-you-configure-a-data-source-in-spring-boot) |
| 17  | [How do you use Spring Boot with Kubernetes?](#how-do-you-use-spring-boot-with-kubernetes) |
| 18  | [How do you secure a Spring Boot REST API using OAuth2?](#how-do-you-secure-a-spring-boot-rest-api-using-oauth2) |

</details>

---

## Basic Questions

### 1. What is Spring Boot?

Spring Boot is an **open-source Java-based framework** built on top of the original Spring Framework. It is designed to simplify the bootstrapping, creation, and development of new Spring-based applications by offering **Auto-Configuration**, **Embedded Servers**, and **Starter dependencies**.

*   **Analogy:** If standard Spring is a DIY model airplane that requires you to assemble every small screw and engine piece yourself, Spring Boot is a pre-assembled RTF (Ready to Fly) drone. You unbox it, charge it, and it flies immediately.

**[⬆ Back to Top](#table-of-contents)**

---

### 2. What are the advantages of Spring Boot?

The key advantages include:
-   **No XML Configuration:** Avoids the complex XML setups of older Spring versions.
-   **Embedded Tomcat/Jetty:** Runs applications as standard `.jar` files without deploying to external application servers.
-   **Auto-Configuration:** Pre-configures databases, template engines, and security based on jar dependencies.
-   **Starters:** Combines related dependencies into single packages.
-   **Production Readiness:** Comes out-of-the-box with metrics and health monitoring (Actuator).

**[⬆ Back to Top](#table-of-contents)**

---

### 3. What are the main features of Spring Boot?

The core features are:
1.  **Auto-Configuration:** Scans files on the classpath and sets up default beans.
2.  **Starter Dependencies:** Bundled Maven/Gradle dependency structures.
3.  **Spring Boot CLI:** Allows developers to write Groovy scripts to prototype Spring applications quickly.
4.  **Embedded Servers:** Packages Tomcat, Jetty, or Undertow directly inside the executable JAR.
5.  **Actuator:** Provides endpoints to monitor health, threads, memory, and properties.

**[⬆ Back to Top](#table-of-contents)**

---

### 4. What are the differences between Spring and Spring Boot?

| Feature | Spring Framework | Spring Boot |
| :--- | :--- | :--- |
| **Primary Goal** | Provides core Java features like Dependency Injection (DI) and Aspect-Oriented Programming (AOP). | Minimizes development startup time and configuration by offering sensible defaults. |
| **Server** | Developer must configure and deploy application files to an external Tomcat/Wildfly server. | Server is embedded directly in the application JAR. |
| **Configuration** | Extensive XML configuration or Java Config classes are required. | Automatically configures based on classpath items (Convention over Configuration). |

**[⬆ Back to Top](#table-of-contents)**

---

### 5. How does Spring Boot simplify development?

Spring Boot simplifies development by:
-   **Convention over Configuration:** Setting defaults so you don't write configuration classes for standard behaviors (e.g. database connections).
-   **Starter POMs:** Declaring a single starter dependency to import a bunch of related libraries with compatible versions.
-   **Packaging:** Packaging the application as a single executable "Fat JAR" containing both code and the application server.

**[⬆ Back to Top](#table-of-contents)**

---

### 6. How to create a Spring Boot application using Maven?

To create a Spring Boot application using Maven:
1.  Add the `spring-boot-starter-parent` in your `pom.xml`:
    ```xml
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version>
    </parent>
    ```
2.  Add core dependencies (like `spring-boot-starter-web`):
    ```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
    ```
3.  Write the main class annotated with `@SpringBootApplication` and execute `mvn spring-boot:run`.

**[⬆ Back to Top](#table-of-contents)**

---

### 7. How to create a Spring Boot project using Spring Initializer?

1.  Navigate to [start.spring.io](https://start.spring.io/).
2.  Select **Project type** (Maven/Gradle), **Language** (Java), and **Spring Boot version**.
3.  Input project metadata (Group, Artifact, Description, Java Version).
4.  Add dependencies (e.g., *Spring Web, Spring Data JPA, Lombok*).
5.  Click **Generate** to download the ZIP file. Unzip and import it into IntelliJ or Eclipse.

**[⬆ Back to Top](#table-of-contents)**

---

### 8. How do you create a simple Spring Boot application?

1.  Generate the project using Spring Initializr.
2.  Create a main bootstrap class:
    ```java
    @SpringBootApplication
    public class SimpleApplication {
        public static void main(String[] args) {
            SpringApplication.run(SimpleApplication.class, args);
        }
    }
    ```
3.  Create a simple controller to verify it works:
    ```java
    @RestController
    public class HelloController {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, Spring Boot!";
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 9. What are Spring Boot Starters?

Spring Boot Starters are **convenience dependency descriptors** that bundle related jars together. They prevent you from manually listing dependencies and matching their versions.
*   **Example:** If you want to build a REST API, importing `spring-boot-starter-web` automatically installs:
    -   Spring Web MVC
    -   Embedded Tomcat Server
    -   Jackson (for JSON serialization)
    -   Logging framework (Logback)

**[⬆ Back to Top](#table-of-contents)**

---

### 10. What is the use of the @SpringBootApplication annotation?

The `@SpringBootApplication` annotation marks the main entry point class of your application. It acts as a wrapper combining three annotations:
1.  **`@SpringBootConfiguration`:** Custom configuration bean container.
2.  **`@EnableAutoConfiguration`:** Starts auto-configuration processes based on the classpath.
3.  **`@ComponentScan`:** Scan the package containing the main class and all sub-packages for Component classes.

**[⬆ Back to Top](#table-of-contents)**

---

### 11. What is the Spring Initializr?

Spring Initializr is a **web-based bootstrap tool** hosted at `start.spring.io`. It helps developers create custom Spring Boot project folder structures by generating Maven/Gradle configurations with the selected dependencies.

**[⬆ Back to Top](#table-of-contents)**

---

### 12. What are the Spring Boot annotations?

Common Spring Boot annotations are:
-   `@SpringBootApplication`: Main class marker.
-   `@RestController`: Marks REST controller endpoints.
-   `@ConfigurationProperties`: Binds properties from `application.properties` directly to Java classes.
-   `@EnableAutoConfiguration`: Instructs Spring Boot to bootstrap configurations.

**[⬆ Back to Top](#table-of-contents)**

---

### 13. What is Spring Boot dependency management?

Spring Boot manages dependencies by defining a curated list of compatible library versions in `spring-boot-dependencies` (inherited via `spring-boot-starter-parent`). When you add dependencies in your `pom.xml`, you do *not* need to specify the `<version>` tags because Spring Boot handles version matching.

**[⬆ Back to Top](#table-of-contents)**

---

### 14. What are the Spring Boot properties?

Spring Boot properties are **key-value configuration values** specified in `application.properties` or `application.yml` files. They are used to customize framework behaviors (e.g. database credentials, context paths, log levels).

**[⬆ Back to Top](#table-of-contents)**

---

### 15. What is Spring Boot Actuator?

Actuator is a Spring Boot module that adds **monitoring and diagnostic endpoints** to your application. It lets you monitor metrics (like CPU/RAM usage), application health, and thread dumps in production environments.

**[⬆ Back to Top](#table-of-contents)**

---

### 16. How to connect Spring Boot to the database using JPA?

1.  Add `spring-boot-starter-data-jpa` and database drivers (like PostgreSQL) to your pom.xml.
2.  Configure database credentials in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
    spring.datasource.username=postgres
    spring.datasource.password=password
    ```
3.  Define a JPA entity using `@Entity` and create an interface extending `JpaRepository`.

**[⬆ Back to Top](#table-of-contents)**

---

### 17. How to connect Spring Boot application to a database using JDBC?

1.  Add the `spring-boot-starter-jdbc` dependency and the target database driver.
2.  Define connection parameters in `application.properties`.
3.  Inject and use `JdbcTemplate` inside your service class:
    ```java
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addRecord(String name) {
        jdbcTemplate.update("INSERT INTO names (name) VALUES (?)", name);
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 18. What is @RestController annotation in Spring Boot?

The `@RestController` annotation is a specialized version of `@Controller` that includes the `@ResponseBody` annotation. It ensures that the return values of handler methods are serialized directly to HTTP response bodies (as JSON/XML) instead of rendering HTML templates.

**[⬆ Back to Top](#table-of-contents)**

---

### 19. What is @RequestMapping annotation in Spring Boot?

`@RequestMapping` is used to map web requests to controller classes or specific handler methods. It can receive parameters like `path`, `method` (GET, POST, etc.), `headers`, and `produces`.
*   **Example:** `@RequestMapping(value = "/student", method = RequestMethod.GET)` maps GET requests on `/student`.

**[⬆ Back to Top](#table-of-contents)**

---

### 20. How does Spring Boot simplify dependency management?

Spring Boot simplifies dependency management by using the **Starter POMs** parent project. It imports a single pre-configured bill-of-materials (BOM) file that sets consistent versions for dozens of third-party libraries, ensuring that they work together without conflicts.

**[⬆ Back to Top](#table-of-contents)**

---

### 21. What is the role of embedded servers in Spring Boot?

Embedded servers (Tomcat, Jetty, Undertow) are packaged directly inside the application's executable JAR file. This removes the dependency on an external application server environment and allows you to run your Java web application on any machine by executing `java -jar app.jar`.

**[⬆ Back to Top](#table-of-contents)**

---

### 22. What are Profiles in Spring Boot?

Profiles allow you to divide your application configuration settings into separate files based on target environments (e.g. `application-dev.properties` for development, `application-prod.properties` for production). You activate them by setting `spring.profiles.active=dev`.

**[⬆ Back to Top](#table-of-contents)**

---

## Intermediate Questions

### 1. What are the basic Spring Boot annotations?

Basic annotations include:
-   `@SpringBootApplication`: Bootstrap entry point.
-   `@RestController`: Exposes REST endpoints.
-   `@Autowired`: Marks dependency injection locations.
-   `@Component`, `@Service`, `@Repository`: Registers beans.
-   `@PathVariable`, `@RequestParam`, `@RequestBody`: Binds HTTP request data to parameters.

**[⬆ Back to Top](#table-of-contents)**

---

### 2. Is it possible to change the port of the embedded Tomcat server in Spring Boot?

Yes. You can change the port of the embedded Tomcat server by setting the `server.port` property inside the `application.properties` file:
```properties
server.port=8081
```

**[⬆ Back to Top](#table-of-contents)**

---

### 3. What is the starter dependency of the Spring Boot module?

The base starter dependency for any Spring Boot application is `spring-boot-starter`. If you are building a web-based REST API, you use `spring-boot-starter-web` which includes the web framework infrastructure.

**[⬆ Back to Top](#table-of-contents)**

---

### 4. What is the default port of Tomcat in Spring Boot?

The default port is **`8080`**.

**[⬆ Back to Top](#table-of-contents)**

---

### 5. Can we disable the default web server in the Spring Boot application?

Yes. You can disable the embedded web server by configuring the application type inside your `application.properties`:
```properties
spring.main.web-application-type=none
```

**[⬆ Back to Top](#table-of-contents)**

---

### 6. How to disable a specific auto-configuration class?

You can disable auto-configuration classes by using the `exclude` attribute on the `@SpringBootApplication` annotation:
```java
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyMainApplication { ... }
```

**[⬆ Back to Top](#table-of-contents)**

---

### 7. Can we create a non-web application in Spring Boot?

Yes. By changing the `spring.main.web-application-type` to `none`, or by removing `spring-boot-starter-web` and implementing `CommandLineRunner` to run a standalone script.

**[⬆ Back to Top](#table-of-contents)**

---

### 8. Explain @RestController annotation in Spring Boot.

`@RestController` compiles `@Controller` and `@ResponseBody` together. Any object returned from a method annotated with `@RestController` is automatically converted to JSON/XML via message converters (like Jackson) and written directly into the HTTP response body.

**[⬆ Back to Top](#table-of-contents)**

---

### 9. Difference between @Controller and @RestController?

-   **`@Controller`:** Returns templates or views (like HTML/Thymeleaf) and handles MVC structures.
-   **`@RestController`:** Tailored for REST APIs; returns data (Java objects converted to JSON/XML) directly to the response body.

**[⬆ Back to Top](#table-of-contents)**

---

### 10. What is the difference between RequestMapping and GetMapping?

-   `@RequestMapping` is generic and can bind any HTTP request method (GET, POST, PUT, etc.).
-   `@GetMapping` is a shortcut specialized specifically for HTTP GET requests. Under the hood, `@GetMapping` is just `@RequestMapping(method = RequestMethod.GET)`.

**[⬆ Back to Top](#table-of-contents)**

---

### 11. What are Profiles in Spring Boot?

Profiles allow developers to segregate parts of their configuration. By prefixing files with `application-{profile}.properties`, you can maintain separate configurations for `dev`, `test`, and `prod` stages.

**[⬆ Back to Top](#table-of-contents)**

---

### 12. How do you enable Actuator in the Spring Boot application?

Add the starter dependency to `pom.xml`:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
You can configure which endpoints are visible in `application.properties`:
```properties
management.endpoints.web.exposure.include=*
```

**[⬆ Back to Top](#table-of-contents)**

---

### 13. How do you handle exceptions in a Spring Boot application?

You handle exceptions globally using `@RestControllerAdvice` and `@ExceptionHandler` methods:
```java
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

### 14. What is Swagger in Spring Boot?

Swagger (OpenAPI) is a tool suite used to **document and test APIs**. It scans your Spring Boot controller classes and generates visual REST documentation (Swagger UI) where users can view and invoke endpoints manually from their browser.

**[⬆ Back to Top](#table-of-contents)**

---

### 15. How do you implement security in a Spring Boot application?

1.  Add `spring-boot-starter-security` to your dependencies.
2.  Create a configuration class extending `SecurityFilterChain` bean:
    ```java
    @Configuration
    @EnableWebSecurity
    public class SecurityConfig {
        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
                .formLogin(Customizer.withDefaults());
            return http.build();
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 16. What are the different ways to configure Spring Boot applications?

1.  **Application Config Files:** `application.properties` or `application.yml`.
2.  **Environment Variables:** Binding using OS environments.
3.  **Command-line Arguments:** Passing variables during jar execution (e.g. `--server.port=9000`).
4.  **Configuration Beans:** `@Configuration` classes using `@Value` or `@ConfigurationProperties`.

**[⬆ Back to Top](#table-of-contents)**

---

### 17. What is Spring Data JPA, and how does it differ from Hibernate?

-   **Hibernate:** An ORM framework that translates Java objects to SQL tables.
-   **Spring Data JPA:** An abstraction layer that simplifies JPA operations by providing repository interfaces (`JpaRepository`) so you don't write entity managers or boilerplate Hibernate transaction code.

**[⬆ Back to Top](#table-of-contents)**

---

### 18. How do you use Spring Boot with Docker?

1.  Generate the jar: `mvn clean package`.
2.  Write a `Dockerfile` in the project root:
    ```dockerfile
    FROM openjdk:17-jdk-alpine
    COPY target/student-api.jar app.jar
    ENTRYPOINT ["java", "-jar", "/app.jar"]
    ```
3.  Build the image: `docker build -t student-api .`.
4.  Run it: `docker run -p 8080:8080 student-api`.

**[⬆ Back to Top](#table-of-contents)**

---

### 19. What is the difference between @Component, @Service, and @Repository annotations?

-   `@Component`: Generic stereotype for any managed bean.
-   `@Service`: Annotates service classes holding business logic.
-   `@Repository`: Annotates repository access interfaces; translates persistence exceptions to Spring database exceptions.

**[⬆ Back to Top](#table-of-contents)**

---

### 20. How do you test RESTful services in Spring Boot?

Use `@WebMvcTest` along with the `MockMvc` class to test controller mappings without booting up the database:
```java
@WebMvcTest(StudentController.class)
public class StudentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetStudents() throws Exception {
        mockMvc.perform(get("/student/"))
               .andExpect(status().isOk());
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

### 21. How do you configure multiple data sources in Spring Boot?

1.  Define separate datasource property keys in properties:
    ```properties
    spring.datasource.first.jdbc-url=jdbc:postgresql://localhost:5432/first
    spring.datasource.second.jdbc-url=jdbc:postgresql://localhost:5432/second
    ```
2.  Define separate datasource bean configuration classes:
    ```java
    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.first")
    public DataSource firstDataSource() { return DataSourceBuilder.create().build(); }

    @Bean
    @ConfigurationProperties("spring.datasource.second")
    public DataSource secondDataSource() { return DataSourceBuilder.create().build(); }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 22. What is the purpose of the @Autowired annotation?

`@Autowired` tells the Spring framework to perform **dependency injection**. It searches the Spring IoC container for a matching bean type and injects it into the target constructor, setter method, or field.

**[⬆ Back to Top](#table-of-contents)**

---

### 23. How do you handle CORS in Spring Boot?

Configure CORS globally by declaring a `WebMvcConfigurer` bean:
```java
@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:3000");
            }
        };
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

## Advanced Questions

### 1. What are the annotations used to create an Interceptor in Spring Boot?

To create an interceptor, you write a class implementing `HandlerInterceptor` (annotated with `@Component`) and register it within a `@Configuration` class implementing `WebMvcConfigurer`.

*   **Interceptor code:**
    ```java
    @Component
    public class LogInterceptor implements HandlerInterceptor {
        @Override
        public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) {
            System.out.println("Intercepting request before controller execution");
            return true;
        }
    }
    ```
*   **Registration code:**
    ```java
    @Configuration
    public class WebConfig implements WebMvcConfigurer {
        @Autowired private LogInterceptor logInterceptor;

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(logInterceptor);
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 2. What is the purpose of Swagger in Spring Boot?

Swagger documents and publishes standard API descriptors. It generates an interactive HTML dashboard that documents endpoint paths, request bodies, query params, and status codes.

**[⬆ Back to Top](#table-of-contents)**

---

### 3. What are the differences between Spring Data JPA and Hibernate?

-   **Hibernate** is the ORM library implementing database persistence queries.
-   **Spring Data JPA** is a wrapper abstraction layer that uses Hibernate underneath, providing predefined repository methods (`findAll`, `save`) and dynamic query generator methods.

**[⬆ Back to Top](#table-of-contents)**

---

### 4. How do you use Spring Boot with Docker?

Package the application as an executable `.jar` file, write a `Dockerfile` referencing a JDK base image (e.g. `openjdk:17-alpine`), copy the jar file to the image directory, and define the `ENTRYPOINT` command to run the jar.

**[⬆ Back to Top](#table-of-contents)**

---

### 5. How to implement caching in Spring Boot?

1.  Add `spring-boot-starter-cache` to your dependencies.
2.  Enable caching using `@EnableCaching` on your config/main class.
3.  Annotate service methods with `@Cacheable`:
    ```java
    @Cacheable("students")
    public StudentDto getStudentById(Long id) { ... }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 6. How to configure Spring Boot for asynchronous processing?

1.  Add `@EnableAsync` to your main class or configuration class.
2.  Annotate target methods in your service class with `@Async`. The method will be executed in a separate thread context pool:
    ```java
    @Async
    public void sendEmailNotification(String email) {
        // Long running email operation
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 7. How do you configure multiple data sources in Spring Boot?

Write configuration classes mapping configuration properties (`@ConfigurationProperties`) to distinct DataSource beans, then configure separate `LocalContainerEntityManagerFactoryBean` and `PlatformTransactionManager` components for each data source.

**[⬆ Back to Top](#table-of-contents)**

---

### 8. What is the purpose of @ComponentScan in the class files?

The `@ComponentScan` annotation tells Spring where to scan for components, configurations, and services. By default, Spring scans all directories underneath the package containing your `@SpringBootApplication` class. If you have components located in an entirely different root package (e.g. `com.other`), you specify it using `basePackages`:
```java
@ComponentScan(basePackages = "com.other")
```

**[⬆ Back to Top](#table-of-contents)**

---

### 9. How to monitor a Spring Boot application using Actuator?

By exposing endpoints under `/actuator/*`. You monitor heap usage, check HTTP request stats, dynamically check logs, and hook it up to visualization systems like Prometheus and Grafana.

**[⬆ Back to Top](#table-of-contents)**

---

### 10. How do you implement distributed tracing in a Spring Boot application using OpenTelemetry?

Include the OpenTelemetry starter dependencies and configure exporter settings in `application.properties` to send span signals to trace collectors like Jaeger, Zipkin, or AWS X-Ray.

**[⬆ Back to Top](#table-of-contents)**

---

### 11. How do you enable HTTPS in a Spring Boot application?

Generate a keystore certificate (PKCS12 or JKS format), place it inside the `src/main/resources` folder, and configure SSL parameters in `application.properties`:
```properties
server.port=8443
server.ssl.key-store=classpath:keystore.p12
server.ssl.key-store-password=yourpassword
server.ssl.key-store-type=PKCS12
```

**[⬆ Back to Top](#table-of-contents)**

---

### 12. What is Spring Boot WebFlux?

Spring Boot WebFlux is a **reactive web framework** that supports non-blocking, asynchronous reactive stream processing. It is built on Project Reactor and runs on servers like Netty to handle high concurrent client requests with minimal CPU threads.

**[⬆ Back to Top](#table-of-contents)**

---

### 13. What is reactive programming in Spring Boot?

Reactive programming is a development paradigm focused on **asynchronous data streams** and non-blocking backpressure. It relies on events and messages propagating through publishers (like `Mono` and `Flux`) to clients.

**[⬆ Back to Top](#table-of-contents)**

---

### 14. How do you deploy a Spring Boot application as a WAR file?

1.  Change packaging inside `pom.xml` to war: `<packaging>war</packaging>`.
2.  Mark `spring-boot-starter-tomcat` as `<scope>provided</scope>`.
3.  Modify the main class to extend `SpringBootServletInitializer` and override the builder method:
    ```java
    public class ServletInitializer extends SpringBootServletInitializer {
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(StudentApiApplication.class);
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 15. How do you integrate Spring Boot with RabbitMQ?

1.  Add `spring-boot-starter-amqp` to your dependencies.
2.  Define configuration host details in properties.
3.  Inject `RabbitTemplate` to push messages, and use `@RabbitListener` to subscribe:
    ```java
    @RabbitListener(queues = "myQueue")
    public void receive(String msg) {
        System.out.println("Received message: " + msg);
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 16. How do you configure a data source in Spring Boot?

Define configuration keys matching `spring.datasource.*` inside properties. Spring Boot's database auto-configuration class reads these fields and creates a HikariCP connection pool bean.

**[⬆ Back to Top](#table-of-contents)**

---

### 17. How do you use Spring Boot with Kubernetes?

1.  Dockerize your application to create a container image.
2.  Define deployment configurations in a Kubernetes YAML file (`deployment.yaml` and `service.yaml`).
3.  Run `kubectl apply -f deployment.yaml` to deploy it inside your Kubernetes cluster.

**[⬆ Back to Top](#table-of-contents)**

---

### 18. How do you secure a Spring Boot REST API using OAuth2?

Use the `spring-boot-starter-oauth2-resource-server` starter and configure a `SecurityFilterChain` bean to validate incoming JWTs against an identity provider (like Keycloak, Okta, or Google OAuth).

**[⬆ Back to Top](#table-of-contents)**

---

## Disclaimer

The questions provided in this repository are a summary of frequently asked questions across numerous companies. The primary purpose is for you to get a sense of what some companies might ask during your interview process. Good luck! 😊
