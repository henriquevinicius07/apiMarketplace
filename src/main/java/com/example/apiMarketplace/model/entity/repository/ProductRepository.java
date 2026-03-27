package com.example.apiMarketplace.model.entity.repository;

import com.example.apiMarketplace.model.entity.*;
import jakarta.persistence.*;
import jakarta.transaction.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Product> produtos() {
        Query q = em.createQuery("from Product");
        return q.getResultList();
    }

    public Product searchById(Long id) {
        return em.find(Product.class, id);
    }

    @Transactional
    public void save(Product product) {
        em.persist(product);
    }

    @Transactional
    public void update(Product product) {
        em.merge(product);
    }

    @Transactional
    public void delete(Long id){
        Product p = searchById(id);
        if (p != null) em.remove(p);
    }
}
