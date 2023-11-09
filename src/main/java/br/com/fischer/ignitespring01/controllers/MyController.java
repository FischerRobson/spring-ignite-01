package br.com.fischer.ignitespring01.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/my-controller")
public class MyController {
    @GetMapping
    public ResponseEntity get() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello!");
    }

    @GetMapping("/{id}")
    public ResponseEntity getId(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body("Id: " + id);
    }

    @GetMapping("/query")
    public ResponseEntity getWithQuery(@RequestParam String id) {
        return ResponseEntity.status(HttpStatus.OK).body("Id: " + id);
    }

    @GetMapping("/query-map")
    public ResponseEntity getWithQueryMapping(@RequestParam Map<String, String> params) {
        return ResponseEntity.status(HttpStatus.OK).body("query: " + params.entrySet());
    }

    @PostMapping("")
    public ResponseEntity post(@RequestBody String username) {
        return ResponseEntity.status(201).body("username:" + username);
    }

    @GetMapping("/headers")
    public ResponseEntity<Object> getWithHeaders(@RequestHeader  Map<String, String> headers) {
        return ResponseEntity.status(HttpStatus.OK).body("header: " + headers.entrySet());
    }

}
