package com.example.tp_dlabs.persistence.daos;

import com.example.tp_dlabs.persistence.dos.TemperatureDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TemperatureDAO {

    @Autowired
    private EntityManager entityManager;

    public void save(TemperatureDO temperature){
        entityManager.persist(temperature);
    }

    public List<TemperatureDO> findAll(){
        Query q = entityManager.createQuery("from TemperatureDO ");
        return q.getResultList();
    }

    public TemperatureDO findOne(int id){
        Query q = entityManager.createQuery("from TemperatureDO where id = :id");
        q.setParameter("id", id);
        return (TemperatureDO) q.getSingleResult();
    }

    public void delete(int id){
        Query q = entityManager.createQuery("delete TemperatureDO where id = :id");
        q.setParameter("id", id);
        q.executeUpdate();
    }
}
