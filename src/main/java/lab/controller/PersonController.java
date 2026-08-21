package lab.controller;

import lab.Person;
import lab.dto.PersonRequest;
import lab.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {
        return personRepository.findById(id)
                .map(person -> ResponseEntity.ok(person))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody PersonRequest request) {

        Person person = new Person();

        person.setName(request.getName());
        person.setAge(request.getAge());

        Person savedPerson = personRepository.save(person);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedPerson);
    }

}