package com.shashank.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

  @GetMapping("/")
  public String home() {

    return "Welcome";
  }

  @GetMapping("/user")
  public String helloUser() {
    return "Welcome user";
  }

  @GetMapping("/admin")
  public String helloAdmin() {
    return "Welcome admin";
  }

}
