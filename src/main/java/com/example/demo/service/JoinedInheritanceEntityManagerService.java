package com.example.demo.service;

import com.example.demo.entity.DescendantEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Service
public class JoinedInheritanceEntityManagerService {

    public void saveEntity() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.example.demo.entity");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        DescendantEntity descendantEntity = new DescendantEntity();
        descendantEntity.setName("name");
        descendantEntity.setSurname("surname");

        em.persist(descendantEntity);
        //em.getTransaction().commit();
    }
}
