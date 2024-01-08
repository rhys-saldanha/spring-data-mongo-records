package org.rhyssaldanha.springdatamongorecords;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataMongoTest
@Testcontainers
@ContextConfiguration(classes = TestSpringDataMongoRecordsApplication.class)
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void querydsl() {
        var person = new Person(UUID.randomUUID(), "John", 42);
        personRepository.save(person);

        var personFromDb = personRepository.findOne(QPerson.person.name.eq("John")).orElseThrow();

        assertEquals(person, personFromDb);
    }
}