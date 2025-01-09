package org.ivoligo.spring.mvc.service;

import org.ivoligo.spring.mvc.model.dto.NewsDto;
import org.ivoligo.spring.mvc.model.dto.NewsFilter;

import java.util.List;

public interface NewsService {

    List<NewsDto> getAll();

    void create(NewsDto newsDto);

    void update(NewsDto newsDto);

    List<NewsDto> find(NewsFilter filter);

    void delete(NewsDto newsDto);
}
