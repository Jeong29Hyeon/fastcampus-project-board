package com.fastcampus.projectboard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * /articles                테스트 작성 완료
 * /articles/(article-id)   테스트 작성 완료
 * /articles/search         테스트 작성 완료
 * /articles/search-hashtag 테스트 작성 완료
 */

@RequestMapping("/articles")
@Controller
public class ArticleController {

    @GetMapping
    public String articles(ModelMap map){
        map.addAttribute("articles", List.of());
        return "articles/index";
    }
}
