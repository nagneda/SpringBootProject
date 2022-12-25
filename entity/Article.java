package com.example.study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Entity //db가 해당 객체를 인식 가능
public class Article {


    @Id // db 고유의 대표값을 지정해주는 id
    @GeneratedValue // id 자동 생성 어노테이션 ex)1,2,3,...
    private Long id;

    @Column
    private String title;
    
    @Column
    private String content;



}
