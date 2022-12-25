package com.example.study.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.study.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
