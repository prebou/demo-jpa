package fr.diginamic;

import fr.diginamic.entite.Livre;
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


        EntityManagerFactory entiteLivre = Persistence.createEntityManagerFactory("bdd2");
        EntityManager emLivre = entiteLivre.createEntityManager();
        emLivre.getTransaction().begin();
        Livre livre = emLivre.find(Livre.class,1);
        System.out.println(livre);
        emLivre.getTransaction().commit();
        emLivre.close();
        entiteLivre.close();
    }

}
