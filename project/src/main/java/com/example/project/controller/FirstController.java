package com.example.project.controller;

import com.example.project.CallPython;
import com.example.project.CallPython_menu;
import com.example.project.dto.testForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
@Slf4j
public class FirstController {

    @GetMapping("/hi")
    public String hiasdf(Model model){
        CallPython_menu py2 = new CallPython_menu();
        String menu = py2.main();
        model.addAttribute("menulist",menu);
        return "menu";
    }
    @PostMapping("/bye")
    public String createArticle(testForm form, Model model) throws SQLException {

        CallPython py = new CallPython();
        String barcode = py.main(form.title);
        model.addAttribute("barcode", barcode);
        return "bye";
    }

}
