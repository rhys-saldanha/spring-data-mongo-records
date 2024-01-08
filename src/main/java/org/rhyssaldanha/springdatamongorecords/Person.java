package org.rhyssaldanha.springdatamongorecords;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public record Person(
        @Id UUID id,
        String name,
        int age) {
}
