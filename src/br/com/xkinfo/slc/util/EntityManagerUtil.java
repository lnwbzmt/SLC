package br.com.xkinfo.slc.util;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

    private static EntityManagerFactory emf= null;
    //private static EntityManager em = null;
    
    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("SLCPU");
        }
        return emf.createEntityManager();
    }
}
