package com.anhvt.prj.vchecker.controller.admin;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/admin/home", "/admin"})
public class AdmHomeController {
    @GetMapping("")
    public String home(HttpServletRequest request) {
        return "admin/index";
    }
}
