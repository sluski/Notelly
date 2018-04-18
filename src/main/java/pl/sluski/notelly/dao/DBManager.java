package pl.sluski.notelly.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Sluski
 */
public class DBManager {
    private static DBManager instance;
    private static EntityManagerFactory entityManagerFactory;
    
    private DBManager(){
        entityManagerFactory = Persistence.createEntityManagerFactory("pl.sluski_Notelly_war_1.0-SNAPSHOTPU");
    }
    
    public static DBManager createInstance(){
        if(instance == null) instance = new DBManager();
        return instance;
        
    }
    
    public EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }
}
