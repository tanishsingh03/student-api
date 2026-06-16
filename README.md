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

*   **Analogy:** Traditional Spring is like a kit to build a custom computer. You have to purchase the motherboard, CPU, RAM, and graphics card separately, and make sure all components are compatible. Spring Boot is like a pre-assembled, plug-and-play MacBook. You turn it on, and everything is pre-configured and ready for use.
*   **Deep Dive:** Spring Boot is an extension of the Core Spring Framework. It utilizes **Convention over Configuration**. It automatically configures Spring-based applications based on the jar dependencies found on the classpath. By providing auto-configuration scripts, starter dependencies, and embedded containers, it speeds up development cycles and eliminates XML/Java boilerplate configuration.
*   **Core Pillars:**
    *   **Auto-Configuration:** Configures components automatically.
    *   **Starters:** Curated dependency bundles.
    *   **Embedded Servers:** Runs directly without external deployments.
    *   **Actuator:** Provides production-ready diagnostics.
*   **Interview Pitch:** *"Spring Boot is an extension of the Spring Framework designed to simplify development. It eliminates boilerplate configuration using auto-configuration, packages applications with embedded servers like Tomcat, and manages matching library versions through starter dependencies."*

**[⬆ Back to Top](#table-of-contents)**

---

### 2. What are the advantages of Spring Boot?

*   **Detailed Explanation:**
    1.  **Increases Productivity:** Developers focus purely on business logic rather than writing infrastructure code.
    2.  **Embedded Container Support:** Eliminates complex configurations needed to set up external application servers (Tomcat, WebLogic, Wildfly).
    3.  **Reduces Boilerplate:** No more lengthy XML settings or massive Java configuration files.
    4.  **Sensible Defaults:** Installs logical default configurations for databases, cache engines, and logging.
    5.  **Easy Monitoring:** Integrates Actuator endpoints to track JVM state, thread counts, health diagnostics, and environment stats in real-time.
*   **Interview Pitch:** *"The primary advantages of Spring Boot are reduced bootstrap time due to auto-configuration, embedded application servers which allow standalone execution, simplified dependency version matching using starters, and out-of-the-box system monitoring via Actuator."*

**[⬆ Back to Top](#table-of-contents)**

---

### 3. What are the main features of Spring Boot?

*   **Deep Dive:**
    1.  **Auto-Configuration:** Scans jars on the classpath and instantiates required beans conditionally (e.g., configuring a PostgreSQL database pool automatically if the PostgreSQL driver jar is present).
    2.  **Starter POMs:** Declaring `spring-boot-starter-web` fetches Tomcat, Jackson JSON, Spring MVC, and Logging in one step.
    3.  **Spring Boot Actuator:** Provides endpoints like `/actuator/health` and `/actuator/metrics` to expose CPU load, RAM usage, and database connection state.
    4.  **Embedded Servers:** Bundles servlet containers directly into target JAR packages.
    5.  **Externalized Configuration:** Supports reading settings from environment variables, command-line arguments, or properties files across environments.
*   **Interview Pitch:** *"The main features are Auto-Configuration, Starter POMs, Embedded Servers, Actuator for system metrics, and Externalized Configuration to manage environments dynamically."*

**[⬆ Back to Top](#table-of-contents)**

---

### 4. What are the differences between Spring and Spring Boot?

*   **Deep Dive:**

| Criteria | Spring Framework | Spring Boot |
| :--- | :--- | :--- |
| **Philosophy** | A robust framework providing core concepts like IoC, AOP, and JDBC wrappers. | An opinionated bootstrap extension to make Spring apps fast to write. |
| **Setup & Config** | Manual XML configuration or Java Config classes (`@Configuration`, `@Bean`) are required. | Zero configuration is needed to get started; uses auto-configuration. |
| **Server Deployment**| Code must be packaged as a WAR file and deployed to an external server. | Code is packaged as an executable JAR and run with a built-in Tomcat server. |
| **Management** | Version tags for all external libraries must be explicitly set and synchronized. | Parent POM handles all compatible version tags automatically. |

*   **Interview Pitch:** *"Spring is a core framework providing features like dependency injection and database abstractions. Spring Boot is an extension that wraps Spring, adding embedded servers, auto-configuration, and starter dependencies to eliminate boilerplate setup."*

**[⬆ Back to Top](#table-of-contents)**

---

### 5. How does Spring Boot simplify development?

*   **Deep Dive:**
    *   **Convention over Configuration:** Spring Boot assumes sensible defaults. For example, if you include JPA, it assumes you want to use Hibernate as your ORM tool.
    *   **Auto-tuning of parameters:** It configures optimal connection limits and default ports automatically.
    *   **Fast bootstrapping:** Allows developers to go from zero to a live REST endpoint in under 2 minutes.
*   **Interview Pitch:** *"Spring Boot simplifies development by prioritizing convention over configuration. It automatically configures sensible defaults for databases, servers, and templating systems, meaning developers write business code instead of system configurations."*

**[⬆ Back to Top](#table-of-contents)**

---

### 6. How to create a Spring Boot application using Maven?

*   **Detailed Explanation:**
    1.  Declare the Spring Boot parent POM inside your `pom.xml` to inherit dependency management rules:
        ```xml
        <parent>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>3.2.0</version>
        </parent>
        ```
    2.  Add starter dependencies:
        ```xml
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
            </dependency>
        </dependencies>
        ```
    3.  Configure the build plugin to package the application as a runnable jar:
        ```xml
        <build>
            <plugins>
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
                </plugin>
            </plugins>
        </build>
        ```
    4.  Create a class with a main method annotated with `@SpringBootApplication` and run it.

**[⬆ Back to Top](#table-of-contents)**

---

### 7. How to create a Spring Boot project using Spring Initializer?

*   **Step-by-step Deep Dive:**
    1.  Go to [start.spring.io](https://start.spring.io/).
    2.  Choose **Maven Project** or **Gradle Project**.
    3.  Select **Java** and choose the Spring Boot version (avoid snapshot versions).
    4.  Input **Metadata**: Group (e.g. `com.tanish`), Artifact (e.g. `student-api`), Packaging (JAR), and Java Version.
    5.  Click **Add Dependencies** and select tools like *Spring Web*, *Spring Data JPA*, *PostgreSQL Driver*, and *Lombok*.
    6.  Click **Generate** to download the project structure ZIP. Unzip and import it into your IDE.
*   **Interview Pitch:** *"Spring Initializer is a project generator tool that constructs a complete Maven or Gradle project structure based on your metadata and selected starter dependencies."*

**[⬆ Back to Top](#table-of-contents)**

---

### 8. How do you create a simple Spring Boot application?

*   **Detailed Code Example:**
    1.  Create the entrypoint class:
        ```java
        package com.tanish.demo;
        
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        
        @SpringBootApplication
        public class DemoApplication {
            public static void main(String[] args) {
                SpringApplication.run(DemoApplication.class, args);
            }
        }
        ```
    2.  Create a REST endpoint:
        ```java
        package com.tanish.demo;
        
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;
        
        @RestController
        public class HelloController {
            @GetMapping("/greet")
            public String greet() {
                return "Spring Boot application is active!";
            }
        }
        ```
    3.  Run the application. The log will confirm Tomcat has started on port 8080. Open `http://localhost:8080/greet` to view the response.

**[⬆ Back to Top](#table-of-contents)**

---

### 9. What are Spring Boot Starters?

*   **Deep Dive:** Starters are dependency descriptors. Instead of manually searching, adding, and matching versions of 20 different jars, you import one starter POM.
    *   **Under the hood:** `spring-boot-starter-web` imports:
        *   `spring-webmvc` (for routing)
        *   `spring-boot-starter-json` (uses Jackson for JSON mapping)
        *   `spring-boot-starter-tomcat` (embedded servlet container)
    *   All dependency versions are controlled by the parent POM.
*   **Interview Pitch:** *"Spring Boot Starters are pre-packaged dependency descriptors that group related libraries together under a single name. They prevent library version conflicts and simplify build configurations."*

**[⬆ Back to Top](#table-of-contents)**

---

### 10. What is the use of the @SpringBootApplication annotation?

*   **Deep Dive:** This annotation goes on your main runner class. It is a convenience wrapper combining three essential annotations:
    1.  **`@SpringBootConfiguration`:** A specialized `@Configuration` annotation. Tells Spring that this class can define beans via `@Bean` methods.
    2.  **`@EnableAutoConfiguration`:** Scans classpath jars and configures default settings (e.g. configuring a Datasource bean if SQL drivers are found).
    3.  **`@ComponentScan`:** Scans the package containing the main class and all subpackages for `@Component`, `@Service`, `@Repository`, and `@RestController` classes, registering them as Spring Beans.
*   **Code Example:**
    ```java
    // Under the hood, `@SpringBootApplication` is defined as:
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @Inherited
    @SpringBootConfiguration
    @EnableAutoConfiguration
    @ComponentScan
    public @interface SpringBootApplication { ... }
    ```
*   **Interview Pitch:** *"@SpringBootApplication is a bootstrap annotation placed on the main class. It acts as a wrapper combining @SpringBootConfiguration, @EnableAutoConfiguration, and @ComponentScan to enable component scanning and default configurations."*

**[⬆ Back to Top](#table-of-contents)**

---

### 11. What is the Spring Initializr?

*   **Detailed Explanation:** Spring Initializr is an open-source web service hosted at `start.spring.io`. It provides an API and UI to generate a skeleton project structure. It resolves the initial directory structure, downloads the Maven/Gradle build files, and sets up dependencies.
*   **Interview Pitch:** *"Spring Initializr is a web tool that simplifies bootstrapping by generating a boilerplate Spring Boot project structure with the dependencies and metadata configured by the user."*

**[⬆ Back to Top](#table-of-contents)**

---

### 12. What are the Spring Boot annotations?

*   **Deep Dive:**
    *   **Core Boot Annotations:**
        *   `@SpringBootApplication`: Main entry point.
        *   `@EnableAutoConfiguration`: Enables default configurations.
        *   `@ConfigurationProperties`: Maps external properties (like yaml fields) to Java POJOs.
    *   **Spring Beans & Injection:**
        *   `@Component`, `@Service`, `@Repository`: Defines beans.
        *   `@Autowired`: Performs dependency injection.
    *   **Web Mappings:**
        *   `@RestController`: Declares REST endpoints.
        *   `@GetMapping`, `@PostMapping`: Configures HTTP method routes.
*   **Interview Pitch:** *"Spring Boot annotations configure application boot processes, map REST endpoints, configure property bindings, and manage dependency injection points throughout the codebase."*

**[⬆ Back to Top](#table-of-contents)**

---

### 13. What is Spring Boot dependency management?

*   **Deep Dive:** Spring Boot uses a **Bill of Materials (BOM)** approach to manage dependency versions.
    *   When you inherit from `spring-boot-starter-parent`, it links your project to `spring-boot-dependencies`.
    *   This parent file contains a `<dependencyManagement>` section listing compatible versions for hundreds of common libraries.
    *   This ensures you do not have to write `<version>` tags in your custom dependencies, eliminating version conflicts.
*   **Interview Pitch:** *"Spring Boot dependency management uses a centralized Bill of Materials (BOM) to define compatible versions for all starter libraries, allowing developers to add dependencies without specifying version tags."*

**[⬆ Back to Top](#table-of-contents)**

---

### 14. What are the Spring Boot properties?

*   **Deep Dive:** Properties are configuration values used to change application behaviors. They are read from `application.properties` or `application.yml` during bootstrap.
    *   **Key namespaces:**
        *   `server.*`: Port, servlet path, SSL configs.
        *   `spring.datasource.*`: DB URL, username, password.
        *   `spring.jpa.*`: DDL auto, sql log formatting settings.
    *   **Retrieving properties:** Use `@Value("${property.name}")` or `@ConfigurationProperties`.
*   **Code Example:**
    ```java
    @Component
    public class SystemSettings {
        @Value("${server.port}")
        private int serverPort; // Injects the configured port (e.g. 8080)
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 15. What is Spring Boot Actuator?

*   **Deep Dive:** Actuator adds production-ready monitoring to your application. It exposes endpoints over HTTP or JMX.
    *   **Common Endpoints:**
        *   `/actuator/health`: Shows application health (UP/DOWN status of DB, Disk, etc.).
        *   `/actuator/metrics`: Exposes JVM heap usage, garbage collection, and request count.
        *   `/actuator/env`: Displays active properties.
        *   `/actuator/loggers`: Allows checking and changing logging levels (e.g. change logging level of a package to `DEBUG`) at runtime without restarting.
*   **Code Example:**
    ```properties
    # Enable all actuator endpoints in application.properties
    management.endpoints.web.exposure.include=*
    ```
*   **Interview Pitch:** *"Spring Boot Actuator is a monitoring module that exposes HTTP endpoints to track application health, database connectivity, memory usage, and runtime environment settings."*

**[⬆ Back to Top](#table-of-contents)**

---

### 16. How to connect Spring Boot to the database using JPA?

*   **Step-by-step Deep Dive:**
    1.  Add `spring-boot-starter-data-jpa` and a database driver (e.g., `postgresql`) to your dependencies.
    2.  Configure database credentials in `application.properties`:
        ```properties
        spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
        spring.datasource.username=postgres
        spring.datasource.password=Tanish#2005
        spring.jpa.hibernate.ddl-auto=update
        ```
    3.  Create an Entity class:
        ```java
        @Entity
        public class Student {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            private String name;
        }
        ```
    4.  Create a Repository interface:
        ```java
        @Repository
        public interface StudentRepository extends JpaRepository<Student, Long> {}
        ```
    5.  Inject the repository and execute database operations.

**[⬆ Back to Top](#table-of-contents)**

---

### 17. How to connect Spring Boot application to a database using JDBC?

*   **Detailed Explanation:**
    *   If you don't want the full overhead of an ORM tool (like Hibernate), you can use JDBC directly using Spring's `JdbcTemplate`.
    *   **Why use it:** Faster execution times and raw SQL query control.
*   **Code Example:**
    ```java
    @Repository
    public class RawStudentRepository {
        private final JdbcTemplate jdbcTemplate;

        public RawStudentRepository(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        public String findNameById(Long id) {
            return jdbcTemplate.queryForObject(
                "SELECT name FROM student WHERE id = ?",
                new Object[]{id},
                String.class
            );
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 18. What is @RestController annotation in Spring Boot?

*   **Deep Dive:** `@RestController` is a convenience annotation that wraps `@Controller` and `@ResponseBody`.
    *   In a standard MVC architecture, `@Controller` returns a view name (a string representing a view template).
    *   By adding `@RestController`, Spring automatically serializes any object returned by a method into JSON (using the Jackson library) and writes it directly to the body of the HTTP response.
*   **Interview Pitch:** *"@RestController is a convenience annotation that combines @Controller and @ResponseBody. It ensures that all controller methods write their return values directly into the HTTP response body as JSON or XML, rather than resolving to HTML views."*

**[⬆ Back to Top](#table-of-contents)**

---

### 19. What is @RequestMapping annotation in Spring Boot?

*   **Deep Dive:** `@RequestMapping` is the core annotation used to bind web requests to controller classes or methods.
    *   **Attributes:**
        *   `value` or `path`: URL endpoint.
        *   `method`: HTTP Method (GET, POST, PUT, DELETE).
        *   `headers`: Match specific request headers.
        *   `consumes` / `produces`: Request/Response media types (JSON/XML).
*   **Code Example:**
    ```java
    @RestController
    @RequestMapping("/student") // Class-level prefix
    public class StudentController {
        
        @RequestMapping(value = "/{id}", method = RequestMethod.GET) // Method-level route
        public ResponseEntity<StudentDto> getStudent(@PathVariable Long id) { ... }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 20. How does Spring Boot simplify dependency management?

*   **Deep Dive:**
    *   In traditional projects, managing dependencies is difficult due to conflicting transitive library versions (e.g. Library A uses version 1.2 of Library C, and Library B uses version 1.5 of Library C).
    *   Spring Boot solves this using the **BOM (Bill of Materials)** pattern. The `spring-boot-starter-parent` references a parent POM containing a tested, compatible list of dependency versions.
    *   When adding libraries, you inherit these tested versions automatically, ensuring stability.
*   **Interview Pitch:** *"Spring Boot simplifies dependency management by using a centralized parent BOM that defines pre-tested, compatible library versions, allowing developers to import dependencies without version conflicts."*

**[⬆ Back to Top](#table-of-contents)**

---

### 21. What is the role of embedded servers in Spring Boot?

*   **Deep Dive:**
    *   In traditional Java web development, you package your project as a WAR file, download a standalone server (like Tomcat or Wildfly), install it on a machine, deploy the WAR file, and run it.
    *   Spring Boot embeds the servlet container (Tomcat by default, but can be switched to Jetty or Undertow) directly inside your executable `.jar` file.
    *   During boot, the main method programmatically initializes the server port and launches the container context directly.
*   **Interview Pitch:** *"Embedded servers package the servlet container directly inside the runnable application JAR. This eliminates the need to deploy WAR files to external application servers, allowing the application to run anywhere using the java -jar command."*

**[⬆ Back to Top](#table-of-contents)**

---

### 22. What are Profiles in Spring Boot?

*   **Deep Dive:** Profiles allow you to isolate parts of your application configuration and load them only under specific environments (e.g. `dev`, `staging`, `prod`).
    *   **Naming Convention:** Configurations are kept in `application-{profile}.properties`.
    *   **Activating Profiles:** Set the property `spring.profiles.active=prod` in your default configuration or pass it as a command-line argument: `java -jar app.jar --spring.profiles.active=prod`.
    *   **Loading Beans conditionally:** Annotate configuration classes or beans with `@Profile`.
*   **Code Example:**
    ```java
    @Configuration
    @Profile("dev") // Loaded only when 'dev' profile is active
    public class MockDatabaseConfig {
        @Bean
        public DataSource dataSource() {
            return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

## Intermediate Questions

### 1. What are the basic Spring Boot annotations?

*   **Deep Dive:** 
    *   `@Component`: General generic bean registry.
    *   `@Service`: Marks business logic classes.
    *   `@Repository`: Marks database access layers with translation capability.
    *   `@Configuration` & `@Bean`: Defines custom configuration classes and manual bean factories.
    *   `@Autowired`: Performs automatic dependency injection.
    *   `@Value`: Inject values from properties files.
    *   `@PathVariable` / `@RequestParam` / `@RequestBody`: Map route arguments.
*   **Interview Pitch:** *"The basic annotations are stereotypes (@Component, @Service, @Repository) for bean creation, @Autowired for dependency injection, @Configuration and @Bean for configuration settings, and web mappings like @RestController and @RequestMapping to handle requests."*

**[⬆ Back to Top](#table-of-contents)**

---

### 2. Is it possible to change the port of the embedded Tomcat server in Spring Boot?

*   **Detailed Explanation:**
    Yes, you can configure this in multiple ways:
    1.  **Application Config:** Set `server.port` in `application.properties` or `application.yml`:
        ```properties
        server.port=8081
        ```
    2.  **Environment Variable:** Set the OS environment variable:
        ```bash
        export SERVER_PORT=8081
        ```
    3.  **Command-line Parameter:** Pass the port parameter at runtime:
        ```bash
        java -jar app.jar --server.port=8081
        ```
    4.  **Random Port:** Set `server.port=0` to let Spring Boot allocate a random unused port (commonly used in integration tests).

**[⬆ Back to Top](#table-of-contents)**

---

### 3. What is the starter dependency of the Spring Boot module?

*   **Deep Dive:**
    The base starter for any Spring Boot application is **`spring-boot-starter`**.
    *   It contains:
        *   `spring-boot`: Core auto-configuration support.
        *   `spring-boot-starter-logging`: Configures Logback and SLF4J for logging.
        *   `jakarta.annotation-api`: Core annotations support.
        *   `spring-core`: Spring framework fundamentals.
*   **Interview Pitch:** *"The base starter dependency is spring-boot-starter. It provides logging, core framework configurations, YAML configuration parsing, and bootstrap support for all Spring Boot applications."*

**[⬆ Back to Top](#table-of-contents)**

---

### 4. What is the default port of Tomcat in Spring Boot?

*   **Detailed Explanation:**
    The default port is **`8080`**. This is configured inside Spring Boot's internal Tomcat auto-configuration class.

**[⬆ Back to Top](#table-of-contents)**

---

### 5. Can we disable the default web server in the Spring Boot application?

*   **Detailed Explanation:**
    Yes. If you are building a non-web application (like a database batch job or a message consumer), you don't need a Tomcat server listening on a port.
    *   Configure this in properties:
        ```properties
        spring.main.web-application-type=none
        ```
    *   Alternatively, define it programmatically in the main class:
        ```java
        SpringApplication app = new SpringApplication(MyApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 6. How to disable a specific auto-configuration class?

*   **Deep Dive:** Sometimes Spring Boot's auto-configuration gets in the way. For example, you might have the JPA dependency but want to configure your own datasource manually rather than letting Spring Boot do it automatically.
*   **Code Example:**
    ```java
    // Method 1: Using annotation attribute
    @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
    public class MyApplication { ... }
    ```
    ```properties
    # Method 2: Using application.properties
    spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 7. Can we create a non-web application in Spring Boot?

*   **Detailed Explanation:**
    Yes. By excluding web dependencies (`spring-boot-starter-web`) and utilizing `CommandLineRunner` or `ApplicationRunner` to run code when the application starts, and setting `spring.main.web-application-type=none`.
*   **Code Example:**
    ```java
    @SpringBootApplication
    public class BatchJobApplication implements CommandLineRunner {
        public static void main(String[] args) {
            SpringApplication.run(BatchJobApplication.class, args);
        }

        @Override
        public void run(String... args) {
            System.out.println("Executing standalone batch job process...");
            // Execute batch task here
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 8. Explain @RestController annotation in Spring Boot.

*   **Deep Dive:** `@RestController` is simply a combination of `@Controller` and `@ResponseBody`.
    *   In standard Spring MVC, handlers map requests to views.
    *   Annotating a controller class with `@RestController` informs the `DispatcherServlet` that every handler method's return value should be written directly into the response body.
    *   Under the hood, Spring registers the `HttpMessageConverter` interface, mapping Java structures into serialization outputs (like JSON via Jackson).

**[⬆ Back to Top](#table-of-contents)**

---

### 9. Difference between @Controller and @RestController?

*   **Deep Dive:**
    *   **`@Controller`:** Used to build traditional MVC web pages. The return values of handler methods are treated as view names (e.g., returning `"index"` renders the `index.html` file).
    *   **`@RestController`:** Used to build REST APIs. The return values of methods are converted to JSON or XML automatically and written directly to the response body.
*   **Interview Pitch:** *"@Controller is used for traditional MVC web applications where methods return HTML templates. @RestController is a convenience annotation combining @Controller and @ResponseBody, meaning methods serialize return values directly to HTTP response bodies as JSON/XML."*

**[⬆ Back to Top](#table-of-contents)**

---

### 10. What is the difference between RequestMapping and GetMapping?

*   **Deep Dive:**
    *   `@RequestMapping` is a general mapping annotation that can handle all HTTP methods.
    *   `@GetMapping` is a specialized annotation for handling HTTP GET requests. Under the hood, it is composed of `@RequestMapping(method = RequestMethod.GET)`.
    *   Similarly, Spring provides `@PostMapping`, `@PutMapping`, `@DeleteMapping`, and `@PatchMapping`.
*   **Code Example:**
    ```java
    // These two mappings do the exact same thing:
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> getStudents() { ... }

    @GetMapping("/student")
    public List<Student> getStudents() { ... }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 11. What are Profiles in Spring Boot?

*   **Deep Dive:** Profiles allow you to define environment-specific configurations.
    *   **Structure:** Maintain configurations inside `application-dev.properties`, `application-test.properties`, and `application-prod.properties`.
    *   **Activation:** Set `spring.profiles.active=dev`.
    *   **Conditional Code:** Use `@Profile("dev")` to load specific configuration beans only in development.

**[⬆ Back to Top](#table-of-contents)**

---

### 12. How do you enable Actuator in the Spring Boot application?

*   **Detailed Explanation:**
    1.  Add the dependency in your `pom.xml`:
        ```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        ```
    2.  By default, only `/actuator/health` and `/actuator/info` are visible. To expose all endpoints over HTTP, add this to `application.properties`:
        ```properties
        management.endpoints.web.exposure.include=*
        ```
    3.  Launch your application and access `http://localhost:8080/actuator`.

**[⬆ Back to Top](#table-of-contents)**

---

### 13. How do you handle exceptions in a Spring Boot application?

*   **Deep Dive:** In REST APIs, you want to return clean, structured JSON errors when something goes wrong. Spring MVC solves this using `@RestControllerAdvice` and `@ExceptionHandler`.
*   **Code Example:**
    1.  Create a custom Exception:
        ```java
        public class StudentNotFoundException extends RuntimeException {
            public StudentNotFoundException(String message) { super(message); }
        }
        ```
    2.  Define a Global Exception Handler:
        ```java
        @RestControllerAdvice
        public class GlobalExceptionHandler {
            
            @ExceptionHandler(StudentNotFoundException.class)
            public ResponseEntity<Map<String, Object>> handleNotFound(StudentNotFoundException ex) {
                Map<String, Object> error = new HashMap<>();
                error.put("timestamp", LocalDateTime.now());
                error.put("status", HttpStatus.NOT_FOUND.value());
                error.put("error", "Not Found");
                error.put("message", ex.getMessage());
                
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
            }
        }
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 14. What is Swagger in Spring Boot?

*   **Deep Dive:** Swagger (now standardization under the **OpenAPI** specification) dynamically documents your API.
    *   In modern applications, you integrate `springdoc-openapi-starter-webmvc-ui`.
    *   It automatically scans your `@RestController` classes, extracts paths, parameters, schemas, and outputs a JSON document.
    *   It also provides a web dashboard (`/swagger-ui.html`) where frontend developers can test endpoints directly.
*   **Code Example:**
    ```xml
    <!-- Add springdoc dependency inside pom.xml -->
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.2.0</version>
    </dependency>
    ```
*   **Interview Pitch:** *"Swagger is an API documentation tool that integrates with Spring Boot via the springdoc-openapi dependency. It automatically reads controllers and endpoints to generate a visual, interactive documentation UI (/swagger-ui.html) to test endpoints."*

**[⬆ Back to Top](#table-of-contents)**

---

### 15. How do you implement security in a Spring Boot application?

*   **Deep Dive:** Spring Security uses a chain of **Servlet Filters** to intercept requests.
    1.  Add `spring-boot-starter-security` to your `pom.xml`.
    2.  By default, all endpoints are secured with Basic Auth, and a default password is printed to the console on startup.
    3.  To customize authentication rules, declare a `SecurityFilterChain` bean:
        ```java
        @Configuration
        @EnableWebSecurity
        public class SecurityConfig {
            
            @Bean
            public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http
                    .csrf(csrf -> csrf.disable()) // Disable CSRF for REST APIs
                    .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/public/**").permitAll() // Open endpoints
                        .anyRequest().authenticated() // Secure others
                    )
                    .httpBasic(Customizer.withDefaults()); // Enable Basic Auth
                
                return http.build();
            }
        }
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 16. What are the different ways to configure Spring Boot applications?

*   **Detailed Explanation:**
    Spring Boot loads configurations in a specific order of priority:
    1.  **Command-line arguments:** Overrides all other properties (e.g. `--server.port=9090`).
    2.  **JVM System Properties:** System properties passed with `-Dserver.port=9090`.
    3.  **OS Environment Variables:** (e.g., `SERVER_PORT=9090`). Great for Docker environments.
    4.  **Properties Files:** `application.properties` or `application.yml` inside the jar file.
    5.  **Default Properties:** Declared inside configuration code.

**[⬆ Back to Top](#table-of-contents)**

---

### 17. What is Spring Data JPA, and how does it differ from Hibernate?

*   **Deep Dive:**
    *   **Hibernate:** A framework that maps Java classes to database tables (ORM). It handles the actual database connections and executes SQL queries.
    *   **JPA (Jakarta Persistence API):** A Java specification containing standard annotations (like `@Entity`, `@Id`) and rules, which Hibernate implements.
    *   **Spring Data JPA:** An abstraction layer on top of Hibernate. Instead of manually writing code to manage transactions or write entity managers, Spring Data JPA provides interfaces like `JpaRepository` that automatically implement CRUD methods at runtime.
*   **Interview Pitch:** *"Hibernate is the ORM framework that implements database mappings and executes SQL queries. Spring Data JPA is a higher-level abstraction layer that builds on top of JPA/Hibernate, providing repositories and query methods to eliminate database boilerplate."*

**[⬆ Back to Top](#table-of-contents)**

---

### 18. How do you use Spring Boot with Docker?

*   **Step-by-step Deep Dive:**
    1.  Build the executable jar of the application:
        ```bash
        ./mvnw clean package
        ```
    2.  Create a file named `Dockerfile` in the project root:
        ```dockerfile
        FROM eclipse-temurin:17-jdk-alpine
        WORKDIR /app
        COPY target/student-api-0.0.1-SNAPSHOT.jar app.jar
        EXPOSE 8080
        ENTRYPOINT ["java", "-jar", "app.jar"]
        ```
    3.  Build the Docker image:
        ```bash
        docker build -t student-api:latest .
        ```
    4.  Run the container:
        ```bash
        docker run -p 8080:8080 student-api:latest
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 19. What is the difference between @Component, @Service, and @Repository annotations?

*   **Deep Dive:** All three tell Spring to create a bean, but they represent different layers:
    *   **`@Component`:** The parent stereotype. Use this for general utility classes.
    *   **`@Service`:** Semantic annotation for classes in the business logic layer.
    *   **`@Repository`:** Annotates database access layers. It provides **Exception Translation**: low-level SQLExceptions are automatically translated into Spring's unchecked `DataAccessException` classes.
*   **Interview Pitch:** *"@Component is a generic stereotype annotation for any Spring-managed bean. @Service and @Repository are specialized components: @Service is used for business logic, and @Repository is used for data access, providing automatic database exception translation."*

**[⬆ Back to Top](#table-of-contents)**

---

### 20. How do you test RESTful services in Spring Boot?

*   **Deep Dive:**
    *   Loading the database and entire context for every test is slow.
    *   Spring solves this using **Sliced Testing** with `@WebMvcTest`. This loads *only* the web layer beans (Controllers, filters) and ignores services or repositories.
    *   You use `@MockBean` (or `@MockitoBean` in newer versions) to mock the database and business layers.
*   **Code Example:**
    ```java
    @WebMvcTest(StudentController.class)
    public class StudentControllerTest {
        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private StudentService studentService; // Mocked service

        @Test
        public void getStudentById_ShouldReturnOk() throws Exception {
            Mockito.when(studentService.getStudentById(1L))
                   .thenReturn(new StudentDto(1L, "Utkarsh", "utkarsh@gmail.com"));

            mockMvc.perform(get("/student/1"))
                   .andExpect(status().isOk())
                   .andExpect(jsonPath("$.name").value("Utkarsh"));
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 21. How do you configure multiple data sources in Spring Boot?

*   **Step-by-step Deep Dive:**
    1.  Add connection properties for both databases in `application.properties`:
        ```properties
        spring.datasource.db1.url=jdbc:postgresql://localhost:5432/db1
        spring.datasource.db2.url=jdbc:postgresql://localhost:5432/db2
        ```
    2.  Write a configuration class to initialize both data sources:
        ```java
        @Configuration
        public class DataSourceConfig {
            
            @Bean
            @Primary
            @ConfigurationProperties("spring.datasource.db1")
            public DataSource primaryDataSource() {
                return DataSourceBuilder.create().build();
            }
            
            @Bean
            @ConfigurationProperties("spring.datasource.db2")
            public DataSource secondaryDataSource() {
                return DataSourceBuilder.create().build();
            }
        }
        ```
    3.  Define separate EntityManagers and TransactionManagers for both data sources.

**[⬆ Back to Top](#table-of-contents)**

---

### 22. What is the purpose of the @Autowired annotation?

*   **Deep Dive:** `@Autowired` tells the Spring framework to resolve a matching bean from the IoC container and inject it here.
    *   **Resolution Strategy:**
        1.  **By Type:** Spring searches the container for a bean of the requested interface or class type.
        2.  **By Name:** If multiple beans of the same type exist, Spring tries to match the variable name to the bean name.
        3.  **Failure:** If no unique match is found, Spring throws `NoUniqueBeanDefinitionException`.

**[⬆ Back to Top](#table-of-contents)**

---

### 23. How do you handle CORS in Spring Boot?

*   **Deep Dive:** **CORS (Cross-Origin Resource Sharing)** is a browser security mechanism that blocks web clients from fetching resources from a different domain (origin) unless allowed.
*   **Code Example (Global CORS Config):**
    ```java
    @Configuration
    public class CorsConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**") // Allow CORS on all endpoints
                    .allowedOrigins("http://localhost:3000") // Frontend origin
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")
                    .allowedHeaders("*");
        }
    }
    ```
    *   Alternatively, apply `@CrossOrigin(origins = "http://localhost:3000")` on top of specific `@RestController` classes.

**[⬆ Back to Top](#table-of-contents)**

---

## Advanced Questions

### 1. What are the annotations used to create an Interceptor in Spring Boot?

*   **Deep Dive:** Interceptors act like servlet filters, but they run inside the Spring MVC context (after the request hits the `DispatcherServlet`, but before it reaches the controller).
    *   **Use Cases:** Logging request durations, checking custom headers, or validating authorization tokens.
*   **Code Example:**
    1.  Create the Interceptor:
        ```java
        @Component
        public class CustomInterceptor implements HandlerInterceptor {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
                System.out.println("Processing request on: " + request.getRequestURI());
                return true; // Return true to continue request path, false to block it
            }
        }
        ```
    2.  Register the Interceptor:
        ```java
        @Configuration
        public class WebMvcConfig implements WebMvcConfigurer {
            @Autowired
            private CustomInterceptor customInterceptor;

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(customInterceptor);
            }
        }
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 2. What is the purpose of Swagger in Spring Boot?

*   **Deep Dive:** In REST APIs, the backend and frontend are separate. To help frontend or mobile developers understand what endpoints are available and what parameters they require, we write documentation.
    *   **Swagger (OpenAPI)** dynamically reads your controller annotations (like `@GetMapping`, `@RequestBody`) and automatically outputs interactive documentation at `/swagger-ui/index.html`.
*   **Interview Pitch:** *"Swagger generates interactive documentation for REST APIs. By scanning controllers and schemas, it generates an HTML dashboard (Swagger UI) that maps endpoints, request schemas, and response codes, making API integration easy for clients."*

**[⬆ Back to Top](#table-of-contents)**

---

### 3. What are the differences between Spring Data JPA and Hibernate?

*   **Deep Dive:**
    *   **Hibernate:** The actual engine (ORM framework) that converts Java entities into SQL statements, manages database connections, handles first-level cache, and interacts with the database driver.
    *   **Spring Data JPA:** An abstraction layer that simplifies JPA operations. Under the hood, it converts your repository interface methods (like `findAll()`) into JPA queries, which are then passed to Hibernate to execute.
*   **Interview Pitch:** *"Hibernate is a concrete database ORM framework that implements persistence logic. Spring Data JPA is an abstraction layer on top of Hibernate that provides pre-built repository interfaces to eliminate database transaction boilerplate."*

**[⬆ Back to Top](#table-of-contents)**

---

### 4. How do you use Spring Boot with Docker?

*   **Deep Dive:** Dockerizing a Spring Boot application involves writing a `Dockerfile` that packages the JRE (Java Runtime Environment) and your application jar.
*   **Code Example:**
    ```dockerfile
    # Step 1: Use lightweight Alpine base image containing JDK
    FROM eclipse-temurin:17-jre-alpine
    WORKDIR /app
    COPY target/student-api.jar app.jar
    ENTRYPOINT ["java", "-jar", "app.jar"]
    ```
    *   Using multi-stage builds can reduce image size by compiling in step 1 and copying only the jar into step 2.

**[⬆ Back to Top](#table-of-contents)**

---

### 5. How to implement caching in Spring Boot?

*   **Deep Dive:** Caching stores frequently requested database results in memory, reducing load on the database.
*   **Step-by-step Deep Dive:**
    1.  Add `spring-boot-starter-cache` to dependencies.
    2.  Annotate your configuration or main class with `@EnableCaching`.
    3.  Annotate the target service method with `@Cacheable`:
        ```java
        @Service
        public class StudentService {
            
            @Cacheable(value = "students", key = "#id")
            public StudentDto getStudentById(Long id) {
                // If ID is cached, this database method is bypassed
                return repository.findById(id).map(this::mapToDto).orElse(null);
            }
        }
        ```
    4.  Use `@CacheEvict(value = "students", key = "#id")` to clear the cache when a student's data is updated.

**[⬆ Back to Top](#table-of-contents)**

---

### 6. How to configure Spring Boot for asynchronous processing?

*   **Deep Dive:** By default, Spring handles HTTP requests synchronously (blocking). If you need to perform a slow process (like sending an email or converting a video), you can run it asynchronously on a separate thread pool.
*   **Code Example:**
    1.  Add `@EnableAsync` to your main application class.
    2.  Annotate the target method in your service with `@Async`:
        ```java
        @Service
        public class NotificationService {
            
            @Async
            public void sendConfirmationEmail(String emailAddress) {
                // This code runs in a separate thread from the task executor pool
                System.out.println("Starting long running email operation...");
                try { Thread.sleep(5000); } catch (Exception e) {}
                System.out.println("Email sent successfully!");
            }
        }
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 7. How do you configure multiple data sources in Spring Boot?

*   **Deep Dive:** To fetch data from two separate databases (e.g., a MySQL user database and a PostgreSQL logs database):
    1.  Define unique properties keys:
        ```properties
        app.datasource.user.url=jdbc:mysql://localhost:3306/users
        app.datasource.logs.url=jdbc:postgresql://localhost:5432/logs
        ```
    2.  Configure two distinct DataSource beans:
        ```java
        @Bean
        @Primary
        @ConfigurationProperties("app.datasource.user")
        public DataSource userDataSource() { return DataSourceBuilder.create().build(); }

        @Bean
        @ConfigurationProperties("app.datasource.logs")
        public DataSource logsDataSource() { return DataSourceBuilder.create().build(); }
        ```
    3.  Create separate packages for the entities and repositories of both databases, and configure separate `EntityManagerFactory` configurations pointing to the correct package locations.

**[⬆ Back to Top](#table-of-contents)**

---

### 8. What is the purpose of @ComponentScan in the class files?

*   **Deep Dive:** Spring uses a component scanning mechanism to find beans.
    *   By default, `@ComponentScan` scans the package of the class it is declared on, and all its subpackages.
    *   If you declare `@SpringBootApplication` on a class inside `com.tanish.student_api`, Spring will scan all components in `com.tanish.student_api.*`.
    *   If you have a component class inside a completely different package structure (like `com.helper.Utils`), Spring will ignore it unless you specify it:
        ```java
        @SpringBootApplication
        @ComponentScan(basePackages = {"com.tanish.student_api", "com.helper"})
        public class StudentApiApplication { ... }
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 9. How to monitor a Spring Boot application using Actuator?

*   **Deep Dive:**
    *   Actuator monitors CPU load, active threads, heap memory, and disk space.
    *   **Prometheus Integration:** Actuator can format its metrics into a style that Prometheus can scrape by importing `micrometer-registry-prometheus`.
    *   **Grafana Integration:** You hook Grafana to Prometheus to view metrics on a visual graph.
*   **Interview Pitch:** *"We monitor applications by adding the Actuator and Micrometer libraries. Actuator exposes metrics over endpoints like /actuator/prometheus, which are scraped by Prometheus and displayed on Grafana dashboards."*

**[⬆ Back to Top](#table-of-contents)**

---

### 10. How do you implement distributed tracing in a Spring Boot application using OpenTelemetry?

*   **Deep Dive:**
    *   In microservice architectures, a single user click might call Service A, which calls Service B, which calls Service C. If the request is slow, it is hard to locate the bottleneck.
    *   **Distributed Tracing** solves this by assigning a unique **Trace ID** to the incoming request. This ID is passed in headers across all downstream HTTP calls.
    *   OpenTelemetry (formerly using Spring Cloud Sleuth) automatically intercepts these requests, collects execution times, and exports them to trace visualize databases like Jaeger or Zipkin.
*   **Interview Pitch:** *"Distributed tracing tracks requests across multiple services. Using OpenTelemetry dependencies, Spring Boot attaches a unique trace ID to incoming HTTP headers. This trace ID propagates through all downstream microservice calls and is exported to Jaeger or Zipkin for performance analysis."*

**[⬆ Back to Top](#table-of-contents)**

---

### 11. How do you enable HTTPS in a Spring Boot application?

*   **Deep Dive:** HTTPS encrypts all network requests.
    1.  Generate a self-signed SSL certificate (or obtain a production CA certificate) using Java keytool:
        ```bash
        keytool -genkeypair -alias mykeystore -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 3650
        ```
    2.  Place the generated `keystore.p12` file inside `src/main/resources`.
    3.  Configure SSL in `application.properties`:
        ```properties
        server.port=8443
        server.ssl.key-store=classpath:keystore.p12
        server.ssl.key-store-password=yourpassword
        server.ssl.key-store-type=PKCS12
        server.ssl.key-alias=mykeystore
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 12. What is Spring Boot WebFlux?

*   **Deep Dive:**
    *   **Spring MVC (Traditional):** Follows a **Thread-per-Request** model. If you have 200 concurrent requests, Spring allocates 200 threads from Tomcat's pool. If all 200 threads are waiting for a slow database, your server cannot accept any more requests.
    *   **Spring WebFlux (Reactive):** Follows a **Non-blocking, event-driven** model. It runs on a Netty server using a small number of thread loops. If a request is waiting for a database response, the thread immediately handles other requests, switching back once the database signals the result is ready.
*   **Interview Pitch:** *"Spring Boot WebFlux is a reactive web framework that supports non-blocking, asynchronous reactive stream processing. Running on Netty, it handles high concurrency with minimal system thread resources, making it ideal for high-throughput microservices."*

**[⬆ Back to Top](#table-of-contents)**

---

### 13. What is reactive programming in Spring Boot?

*   **Deep Dive:** Reactive programming handles data as **asynchronous event streams**. It uses the Project Reactor framework which defines two main publishers:
    -   **`Mono<T>`:** A publisher that emits at most one item (0 or 1 result).
    -   **`Flux<T>`:** A publisher that emits a stream of 0 to N items.
    *   It uses **Backpressure**, allowing consumers to control the rate of incoming data so they are not overloaded.
*   **Code Example:**
    ```java
    @RestController
    public class ReactiveController {
        
        @GetMapping("/stream")
        public Flux<String> getEventStream() {
            return Flux.just("Event 1", "Event 2", "Event 3")
                       .delayElements(Duration.ofSeconds(1)); // Emits stream dynamically
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

### 14. How do you deploy a Spring Boot application as a WAR file?

*   **Step-by-step Deep Dive:**
    1.  Update `pom.xml` packaging type to WAR:
        ```xml
        <packaging>war</packaging>
        ```
    2.  Mark the embedded Tomcat dependency as `provided` so it is not packaged inside the final archive:
        ```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
        ```
    3.  Extend `SpringBootServletInitializer` in your main runner class to bind the servlet context when run inside an external server container:
        ```java
        @SpringBootApplication
        public class StudentApiApplication extends SpringBootServletInitializer {
            
            @Override
            protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
                return builder.sources(StudentApiApplication.class);
            }

            public static void main(String[] args) {
                SpringApplication.run(StudentApiApplication.class, args);
            }
        }
        ```
    4.  Build the file with `mvn clean package` and deploy the generated `.war` file.

**[⬆ Back to Top](#table-of-contents)**

---

### 15. How do you integrate Spring Boot with RabbitMQ?

*   **Deep Dive:** RabbitMQ is a message broker used to decouple microservices.
    1.  Add `spring-boot-starter-amqp` to dependencies.
    2.  Configure RabbitMQ host details in `application.properties`:
        ```properties
        spring.rabbitmq.host=localhost
        spring.rabbitmq.port=5672
        ```
    3.  Send a message using `RabbitTemplate`:
        ```java
        @Service
        public class ProducerService {
            @Autowired private RabbitTemplate rabbitTemplate;

            public void sendMessage(String message) {
                rabbitTemplate.convertAndSend("myExchange", "myRoutingKey", message);
            }
        }
        ```
    4.  Receive messages asynchronously:
        ```java
        @Component
        public class ConsumerService {
            @RabbitListener(queues = "myQueue")
            public void handleMessage(String message) {
                System.out.println("Received: " + message);
            }
        }
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 16. How do you configure a data source in Spring Boot?

*   **Deep Dive:**
    *   Spring Boot scans your properties looking for `spring.datasource.url`, `username`, and `password`.
    *   If found, it imports the default database connection pool library, **`HikariCP`**, and configures a `HikariDataSource` bean automatically.
    *   Hikari manages database connections in a reusable pool, preventing the overhead of opening and closing database sessions constantly.

**[⬆ Back to Top](#table-of-contents)**

---

### 17. How do you use Spring Boot with Kubernetes?

*   **Deep Dive:** Kubernetes orchestrates docker containers.
    1.  Package your Spring Boot application inside a Docker container image.
    2.  Write a deployment YAML configuration (`deployment.yaml`) detailing replicas, ports, and image location.
    3.  Implement **Liveness** and **Readiness** health checks using Actuator:
        *   **Readiness Check:** Tells Kubernetes if the container is ready to accept user requests (e.g. database connection is open).
        *   **Liveness Check:** Tells Kubernetes if the container has locked up/crashed and needs to be restarted.
        ```yaml
        # Kubernetes probe config
        readinessProbe:
          httpGet:
            path: /actuator/health/readiness
            port: 8080
        livenessProbe:
          httpGet:
            path: /actuator/health/liveness
            port: 8080
        ```

**[⬆ Back to Top](#table-of-contents)**

---

### 18. How do you secure a Spring Boot REST API using OAuth2?

*   **Deep Dive:**
    *   OAuth2 is an open authorization standard.
    *   Instead of your REST API verifying usernames and passwords directly, it delegates authentication to an Identity Provider (like Keycloak, Okta, Auth0, or Google).
    *   **Flow:**
        1.  The client logs into the Identity Provider.
        2.  The provider issues a signed cryptographically secured **JWT (JSON Web Token)**.
        3.  The client attaches this token in headers: `Authorization: Bearer <token>`.
        4.  Your Spring Boot API is configured as a **Resource Server**. It reads the JWT, verifies the digital signature using public keys retrieved from the provider, and extracts user credentials and roles to grant access.
*   **Code Example (Security Configuration):**
    ```java
    @Configuration
    @EnableWebSecurity
    public class SecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http
                .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/api/admin/**").hasRole("ADMIN")
                    .anyRequest().authenticated()
                )
                .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults())); // Enable Resource Server
            
            return http.build();
        }
    }
    ```

**[⬆ Back to Top](#table-of-contents)**

---

## Disclaimer

The questions provided in this repository are a summary of frequently asked questions across numerous companies. The primary purpose is for you to get a sense of what some companies might ask during your interview process. Good luck! 😊
