package es.ies.puerto.entities;

import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonajeTest {
    static EntityManagerFactory emf;
    EntityManager em;
    Personaje personaje;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
    }

    @BeforeEach
    public void initEntityManager() {
        em = emf.createEntityManager();
        personaje = new Personaje();
        personaje.setNombre("personTest");
        try {
            // Persist in database
            em.getTransaction().begin();
            em.persist(personaje);
            em.getTransaction().commit();
        } catch (Throwable e) {
            Assertions.fail("Se ha producido un error:"+e.getMessage());
        }
    }
    @Test
    public void testPersistFind() {
        try {
            Personaje personajeDB = em.find(Personaje.class, personaje.getId());
            Assertions.assertEquals(personaje.getNombre(), personajeDB.getNombre());
        } catch (Throwable e) {
            Assertions.fail("Se ha producido un error:"+e.getMessage());
        }
    }
}
