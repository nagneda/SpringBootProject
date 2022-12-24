package com.example.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.study.dto.ArticleForm;
import com.example.study.entity.Article;
import com.example.study.repository.ArticleRepository;


@Controller

public class ArticleController {


    @Autowired// spring boot가 자동으로 객체 생성
    private ArticleRepository articleRepository;

    @GetMapping("/articles/New")
    public String newArticleForm(){
        return "articles/New";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        System.out.println("HIHI");


        // 1. DTO를 변환 > ENTITY
        Article article = form.toEntity();
        System.out.println(article.toString());


        // 2.  repository에게 entitty를 db에 저장하게 함
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());


        return "";
    }
}
