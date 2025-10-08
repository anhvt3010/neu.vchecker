package com.anhvt.prj.vchecker.controller.client;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"", "/", "/home"})
public class CliHomeController {
    @GetMapping("")
    public String home(HttpServletRequest request) {
        return "client/index";
    }
}
