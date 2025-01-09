package org.ivoligo.spring.mvc.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.ivoligo.spring.mvc.model.entity.News;
import org.ivoligo.spring.mvc.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsRepositoryImpl implements NewsRepository {


    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<News> findAll() {
        TypedQuery<News> query = sessionFactory.getCurrentSession().createQuery("from News", News.class);
        return query.getResultList();
    }

    @Override
    public void save(News news) {

    }

    @Override
    public void delete(News news) {

    }

    @Override
    public void update(News news) {

    }
}
