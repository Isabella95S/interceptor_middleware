package com.develhope.interceptior_middelware.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @GetMapping("")
    public String oldCode() {
        return "this is an old code";
    }
}
