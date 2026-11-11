package com.example.cloud_fly_backend;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api")

public class NationalController {
    @CrossOrigin(origins = {"https://zhao2741980983.github.io", "http://localhost:5173"})
    @GetMapping("/national")
    public String getNational() throws IOException {
        ClassPathResource resource = new ClassPathResource("national.json");
        return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
    }
}
