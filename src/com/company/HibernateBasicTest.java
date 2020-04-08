package com.company;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import javax.persistence.Persistence;

public class HibernateBasicTest {
    @Test
    void sessionOk() {
        Persistence.createEntityManagerFactory("mySQL-persistence-unit");
    }
}
