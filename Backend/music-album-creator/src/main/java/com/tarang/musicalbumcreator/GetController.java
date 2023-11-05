package com.tarang.musicalbumcreator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

  @GetMapping("/get")
  String getMsg() {
	  return "Music";
  }
}