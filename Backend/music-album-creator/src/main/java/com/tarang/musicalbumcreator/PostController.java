package com.tarang.musicalbumcreator;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @PostMapping("/post")
  String receiveAndGetMsg(@RequestBody PostEntity postEntity ) {
	  return "Hi, My name is " + postEntity.getName() + ". I wish to say - \"" + postEntity.getMsg() + "\"";
  }
}