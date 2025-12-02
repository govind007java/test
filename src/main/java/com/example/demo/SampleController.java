package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class SampleController {

    @PostMapping("/hi")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("Test successful");
    }

    @GetMapping("/hi1")
    public ResponseEntity<String> testEndpoint1() {
        return ResponseEntity.ok("Test successful");
    }
}
