# Java Study

A hands-on Java study project focused on learning core Java concepts through small practical experiments.

## 1. Object-Oriented Programming (OOP)

### Person

Introduced the `Person` class and basic object creation.

- Classes and objects
- Attributes and methods
- Constructors
- Encapsulation
- Getters and setters
- Input validation
- Object state
- `static` fields and automatic ID generation

### Person behavior

Added behavior to objects through methods.

- Instance methods
- Method parameters and return values
- Object state used inside methods

### Person relationships

Objects can reference other objects.

- Object references
- Relationships between objects
- `Person` referencing another `Person`

### Musician

Introduced `Musician` as a specialization of `Person`.

- Inheritance
- `extends`
- Method overriding
- `@Override`
- Polymorphism
- Specialized attributes and behavior

### Band

Introduced `Band` as an object that manages multiple musicians.

- Composition
- `List<Musician>`
- `ArrayList`
- Adding and retrieving members
- Validation of object state
- Preventing duplicate members when adding them

## 2. Unit Testing

Introduced unit testing with JUnit.

- Maven test dependencies
- `@Test`
- `assertEquals`
- `assertThrows`
- Testing expected behavior
- Testing invalid input
- Running tests through IntelliJ IDEA

## 3. Spring Boot

Introduced a basic Spring Boot application.

- Spring Boot application startup
- `@SpringBootApplication`
- `SpringApplication.run()`
- Spring components
- `@Component`
- Dependency Injection
- Constructor injection

## 4. JPA and PostgreSQL

Introduced persistence with JPA and PostgreSQL.

- PostgreSQL running with Docker
- Database inspection with DBeaver
- `@Entity`
- `@Id`
- `@GeneratedValue`
- `GenerationType.IDENTITY`
- Entity relationships with `@ManyToOne`
- Spring Data JPA
- `JpaRepository`
- Persisting Java objects into PostgreSQL
- Mapping Java objects to database tables

## 5. REST API

Introduced a basic REST API using Spring MVC.

- HTTP request and response basics
- REST controllers
- `@RestController`
- `@RequestMapping`
- `@GetMapping`
- `@PostMapping`
- `@PathVariable`
- `@RequestBody`
- `ResponseEntity`
- HTTP status codes
- `200 OK`
- `201 Created`
- `404 Not Found`
- JSON request and response
- DTOs
- `PersonRequest`
- Reading persisted data through REST
- Creating persisted data through REST
- Testing API endpoints with Postman