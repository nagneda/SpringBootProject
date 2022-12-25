package com.example.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.study.dto.ArticleForm;
import com.example.study.entity.Article;
import com.example.study.repository.ArticleRepository;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j // 로깅을 위한 어노테이션
public class ArticleController {


    @Autowired// spring boot가 자동으로 객체 생성
    private ArticleRepository articleRepository;

    @GetMapping("/articles/New")
    public String newArticleForm(){
        return "articles/New";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        //System.out.println(form.toString()); -> 로깅으로 대체하기, 실제 서버시 이런식으로 system method를 
        //이용해 확인하는 것은 서버 운용에도 안좋고 비효율적이다.
        log.info(form.toString());


        // 1. DTO를 변환 > ENTITY
        Article article = form.toEntity();
        //System.out.println(article.toString());//이때까지만해도 id는 null값
        log.info(article.toString());

        // 2.  repository에게 entitty를 db에 저장하게 함
        Article saved = articleRepository.save(article);
        //Article Repository 클래스에서 다음과 같이 상속을 함. extends CrudRepository<Article, Long>
        //crudrepository는 여러가지 기능을 갖고 있으며 save라는 메소드를 포함하고 있음.
        //System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }
}
