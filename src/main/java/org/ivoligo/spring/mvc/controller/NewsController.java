package org.ivoligo.spring.mvc.controller;

import lombok.var;
import org.ivoligo.spring.mvc.model.dto.NewsDto;
import org.ivoligo.spring.mvc.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/news")
public class NewsController {


    private final NewsService newsService;

    public NewsController(@Autowired NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/")
    public String showAllNews(Model model) {
//    public String showAllNews() {

        final var news = newsService.getAll();
        model.addAttribute("news", news);
        return "/all-news";
    }

    @PostMapping("/add")
    public String addNews(@ModelAttribute("news") NewsDto newsDto) {

        newsService.create(newsDto);
        return "redirect:/";
    }
}
