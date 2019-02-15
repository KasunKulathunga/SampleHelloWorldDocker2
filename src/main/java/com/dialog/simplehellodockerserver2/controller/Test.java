package com.dialog.simplehellodockerserver2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test {

    @GetMapping("/hi")
    public String getHi() {

        return "hello world2";
    }
}
