package com.company;
import static org.junit.jupiter.api.Assertions.*;

import com.company.Model.Journaliste;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**NOTE :
 * Une instance de entity manager est recquise par thread
 *         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mySQL-persistence-unit");
 *         EntityManager entityManager = entityManagerFactory.createEntityManager();
 * Si elle existe déjà, il suffit de la récupérer
 */

public class HibernateBasicTest {
    @Test
    void sessionOk() {

        // Une instance de entity manager par thread
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mySQL-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // vérification si ok
        assertTrue(entityManager.isOpen());

        // fermer
        entityManager.close();
        entityManagerFactory.close();
    }

    @Test
    void testDeLecture( ) {

        /**Une instance de entity manager est recquise par thread **/
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mySQL-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /** pour ouvrir la transaction entityManager.getTransaction().begin(); **/
        // lire => find() __ ecrire => persist()
        Journaliste journaliste = entityManager.find(Journaliste.class, 1);
        assertNotNull(journaliste);
        System.out.println(journaliste);

        /** Toujours fermer la transaction
        // entityManager.getTransaction().commit(); ou rollBack() **/

        entityManager.close();
        entityManagerFactory.close();
    }

   @Test
   void testDEcriture() throws Exception {

        /**Une instance de entity manager est recquise par thread**/
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mySQL-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /** pour ouvrir la transaction entityManager.getTransaction().begin();**/
        // ecrire => persist()

       Journaliste journaliste = new Journaliste("Andry", 4);
       entityManager.persist( journaliste);

       /** Toujours fermer la transaction**/
       // entityManager.getTransaction().commit(); ou rollBack()
       entityManager.close();
       entityManagerFactory.close();
    }
}
