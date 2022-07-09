package com.example.project.controller;

import com.example.project.CallPython;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class FirstController {

    @GetMapping("/hi")
    public String hiasdf(){
        return "main";
    }
    @PostMapping("/bye")
    public String createArticle(Model model){
        CallPython py = new CallPython();
        String barcode = py.main();
        model.addAttribute("title", barcode);
        return "bye";
    }

}
