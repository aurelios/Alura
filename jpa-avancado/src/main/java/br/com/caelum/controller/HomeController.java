package br.com.caelum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() throws SQLException {
        return "home";
    }

}
