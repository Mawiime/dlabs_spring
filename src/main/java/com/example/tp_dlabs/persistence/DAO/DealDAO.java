package com.example.tp_dlabs.persistence.DAO;

import com.example.tp_dlabs.persistence.DO.DealDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class DealDAO {

    @Autowired
    private EntityManager entityManager;

    public void save(DealDO deal){
        entityManager.persist(deal);
    }

    public List<DealDO> findAll(){
        Query q = entityManager.createQuery("from DealDO");
        return q.getResultList();
    }

    public DealDO findOne(int id){
        Query q = entityManager.createQuery("from DealDO where id = :id");
        q.setParameter("id", id);
        return (DealDO) q.getSingleResult();
    }

    public void delete(int id){
        Query q = entityManager.createQuery("delete DealDO where id = :id");
        q.setParameter("id", id);
        q.executeUpdate();
    }
}
