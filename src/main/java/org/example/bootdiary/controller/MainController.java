package org.example.bootdiary.controller;

import org.example.bootdiary.model.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "환영합니다");
        model.addAttribute("message", "어서오세요");
        model.addAttribute("frontImage", "/assets/red-panda.jpg");
        return "index";
    }
}
