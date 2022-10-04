package com.example.DockerSpringApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/")
    public String docker() {
        return "İlk Docker Uygulaması!";
    }
}
