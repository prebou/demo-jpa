package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory entite = Persistence.createEntityManagerFactory("bdd1");
        EntityManager em = entite.createEntityManager();
        System.out.println(em);
        em.close();
        entite.close();
    }
}
