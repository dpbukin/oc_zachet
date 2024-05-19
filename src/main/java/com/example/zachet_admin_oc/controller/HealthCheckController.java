package com.example.zachet_admin_oc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<String> healthCheck() {
        String message = "Через час вы будете смеяться по-иному. А те из вас, кто останется в живых, позавидуют мертвым!";
        return ResponseEntity.ok(message);
    }

}
