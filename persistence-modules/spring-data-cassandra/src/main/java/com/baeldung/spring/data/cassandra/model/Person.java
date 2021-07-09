package com.baeldung.spring.data.cassandra.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Table
@Data
@Builder
public class Person {

    @PrimaryKey
    private UUID id;

    private String firstName;

    private String lastName;

    private Date birthDate;

}
