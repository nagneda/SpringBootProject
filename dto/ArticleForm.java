//이 클래스는 new.mustache에서 form태그의 액션을 통해 클라이언트로부터 form 데이터를
//받아오는 역할을 한다.
package com.example.study.dto;
import com.example.study.entity.Article;



public class ArticleForm {
    
    private String title;
    private String content;

    public ArticleForm(String title, String content){
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ArticleForm{" +
            "title='" + title + '\'' +
            ", content='" + content + '\'' +
            '}';

    }

    public Article toEntity(){
        return new Article(null, title, content);
    }

}