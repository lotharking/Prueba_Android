package com.test.sprongboot.catalogo;

// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class TestController {
  @GetMapping(path = "/hello-world")
  public String helloWorld(){
    return "Hello world!";
  }
}