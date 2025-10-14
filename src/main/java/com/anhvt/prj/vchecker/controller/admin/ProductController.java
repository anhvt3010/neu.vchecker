package com.anhvt.prj.vchecker.controller.admin;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/product")
public class ProductController {
    @GetMapping
    public String list(HttpServletRequest request) {
        return "admin/product/product-list";
    }

    @GetMapping("/add")
    public String add(HttpServletRequest request) {
        return "admin/product/product-add";
    }
}
