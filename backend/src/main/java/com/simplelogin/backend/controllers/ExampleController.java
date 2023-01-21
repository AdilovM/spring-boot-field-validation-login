package com.simplelogin.backend.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * ExmapleController
 *
 * @author Miras Adilov
 */

 @RestController
 @RequestMapping("api/example")
 public class ExampleController {
  @GetMapping("/dummy-endpoint")
  public ResponseEntity<String> get() {
    return ResponseEntity.ok("dummy response");
  }
 }
