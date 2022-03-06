package com.example.springboot04022022;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.stream.Stream;

@SpringBootApplication
@Slf4j
public class Springboot04022022Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04022022Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        final Person person1 = Person.builder().build();
        final Person person2 = Person.builder().firstName("firstName").lastName("lastName").build();

        log.info(person1.toString());
        log.info(person2.toString());

        boolean allMatch = Stream.of(person1.getClass().getDeclaredFields())
                .allMatch(Objects::isNull);

        log.info("allmatch null : " + allMatch);

        boolean person1NullCheck = person1.checkNull();
        boolean person2NullCheck = person2.checkNull();

        log.info("person1: " + person1.isEmpty());
        log.info("person2: " + person2.isEmpty());



        log.info("person1: " + person1.isUserEmpty());
        log.info("person2: " + person2.isUserEmpty());



    }
}


@Data
@Builder
@Slf4j
class Person {
    private static final Person EMPTY = Person.builder().build();
    private String firstName;
    private String lastName;

    public boolean checkNull() throws IllegalAccessException {
        for (Field f : getClass().getDeclaredFields())
            if (f.get(this) != null)
                return false;
        return true;
    }

    public boolean isEmpty() {
        log.info(this.toString());
        log.info(EMPTY.toString());
        return this.equals(EMPTY);
    }

    public boolean isUserEmpty() {
        boolean isEmpty = Stream.of(this.getClass().getDeclaredFields())
                .allMatch(Objects::isNull);

        return isEmpty;
    }
}