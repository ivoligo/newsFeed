package org.ivoligo.spring.mvc.repository;

import org.ivoligo.spring.mvc.model.entity.News;

import java.util.List;

public interface NewsRepository {

    List<News> findAll();

    void save(News news);

    void delete(News news);

    void update(News news);
}
