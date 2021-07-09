package com.baeldung.spring.data.cassandra.repository;

import com.baeldung.spring.data.cassandra.model.Person;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PersonRepository extends CassandraRepository<Person> {

    @Query("select * from person where id = ?0")
    Person findById(UUID id);

}
