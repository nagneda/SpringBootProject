package com.example.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class NewController {
    @GetMapping("/hi")

    public String nice(Model model){// 템플릿 변수를 추가하기 위해 모델 선언 
        model.addAttribute("username","yeongchan");
        return "greetings";
    }

    @GetMapping("/bye")

    public String bye(Model model){
        model.addAttribute("nickname","meme");
        return "goodbye";

    }
    
}
