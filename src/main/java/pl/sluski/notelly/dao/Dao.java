package pl.sluski.notelly.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import pl.sluski.notelly.DBManager;

/**
 *
 * @author Sluski
 * @param <T>
 */
public class Dao<T> {

    private EntityManager entityManager;
    
    // CRUD
    
    // C
    public void add(T objectToAdd) {
        entityManager = DBManager.createInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(objectToAdd);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    // R
    public T findSingleObject(String tableName, String findBy, String value) {
        entityManager = DBManager.createInstance().getEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT e FROM " + tableName + " e WHERE e." 
                + findBy + "='" + value + "'");
        return (T) query.getSingleResult();
    }
    
    public List<T> findAllObjects(String tableName) {
        List<T> listOfObjects;
        entityManager = DBManager.createInstance().getEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT e FROM " + tableName + " e");
        listOfObjects = query.getResultList();
        entityManager.close();
        return listOfObjects;
    }
    
    // U
    public void updateSingleObject(String tableName, String valueToChange, String changeTo, String userNick){
        entityManager = DBManager.createInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createQuery("update " + tableName + " set " + valueToChange + "='" + changeTo + "' where nick='" + userNick + "'").executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    // D
    public void removeAllObjects(String tableName) {
        entityManager = DBManager.createInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNativeQuery("DELETE FROM " + tableName).executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public void removeSingleObject(T objectToRemove) {
        entityManager = DBManager.createInstance().getEntityManager();
        entityManager.getTransaction();
        entityManager.remove(objectToRemove);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    
}
