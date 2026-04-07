package repository;
import config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class GenericDAO <T>{
    private Class<T> entityClass;

    public GenericDAO(Class<T> type){
        this.entityClass = type;
    }

    public void save(T entity){
        Transaction transaction = null;

        try (Session session = HibernateUtil.openSession() ){
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public void update(T entity){
        Transaction transaction = null;
        try(Session session = HibernateUtil.openSession()){
            transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)  transaction.rollback();
        }
    }

    public T getById(Long employeeId){
        try (Session session = HibernateUtil.openSession()){
            return session.get(entityClass, employeeId);
        }
    }

    public List<T> findAll(){
        try (Session session = HibernateUtil.openSession()){
            return session
                .createQuery("from " + entityClass.getSimpleName(), entityClass)
                .getResultList();
        }
    }

    public void delete (Long employeeId) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.openSession()){
            transaction = session.beginTransaction();
            T entity = session.get(entityClass, employeeId);
            if (entity != null) session.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
        }
    }

}
