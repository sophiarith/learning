package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExRestController {
    @GetMapping("/test")
    public ResponseEntity getAll(){
        return ResponseEntity.ok("Hello I'm Success....");
    }
}
