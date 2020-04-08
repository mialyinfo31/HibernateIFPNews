package com.company;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MonEntityManagerFactory {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mySQL-persistence-unit");

    public EntityManager getEntityManagerFactory() {
        return entityManagerFactory.createEntityManager();
    }
}