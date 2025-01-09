package org.ivoligo.spring.mvc.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.var;
import org.ivoligo.spring.mvc.model.dto.NewsDto;
import org.ivoligo.spring.mvc.model.entity.Category;
import org.ivoligo.spring.mvc.model.entity.News;
import org.ivoligo.spring.mvc.repository.NewsRepository;
import org.ivoligo.spring.mvc.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    @Override
    public List<NewsDto> getAll() {

        var test = newsRepository.findAll();
        return test.stream().map(news -> {
            NewsDto newsDto = new NewsDto();
            newsDto.setCategory(news.getCategory().getName());
            newsDto.setTitle(news.getTitle());
            newsDto.setContent(news.getContent());
            newsDto.setDate(news.getDate().toString());
            return newsDto;
        }).collect(Collectors.toList());
    }

    @Override
    public void create(NewsDto newsDto) {

        var category = new Category();
        category.setName(newsDto.getCategory());
        var news = new News();
        news.setDate(new Date());
        news.setTitle(newsDto.getTitle());
        news.setContent(newsDto.getContent());
        news.setCategory(category);
        newsRepository.save(news);
    }
}
