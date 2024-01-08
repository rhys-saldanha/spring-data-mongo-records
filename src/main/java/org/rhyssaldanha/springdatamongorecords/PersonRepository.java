package org.rhyssaldanha.springdatamongorecords;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends MongoRepository<Person, UUID>, QuerydslPredicateExecutor<Person> {
}
