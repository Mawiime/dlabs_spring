package com.example.tp_dlabs.persistence.DAO;

import com.example.tp_dlabs.persistence.DO.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAO {

    @Autowired
    private EntityManager entityManager;

    public void save(UserDO user){
        entityManager.persist(user);
    }

    public List<UserDO> findAll(){
        Query q = entityManager.createQuery("from UserDO");
        return q.getResultList();
    }

    public UserDO findOne(int id){
        Query q = entityManager.createQuery("from UserDO where id = :id");
        q.setParameter("id", id);
        return (UserDO) q.getSingleResult();
    }

    public void delete(int id){
        Query q = entityManager.createQuery("delete UserDO where id = :id");
        q.setParameter("id", id);
        q.executeUpdate();
    }
}
