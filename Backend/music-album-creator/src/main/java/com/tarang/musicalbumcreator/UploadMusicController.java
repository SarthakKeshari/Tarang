//package com.tarang.musicalbumcreator;
//
//import java.util.List;
//
//import javax.swing.text.html.parser.Entity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class UploadMusicController {
//
//  @Autowired
//  UploadMusicRepository uploadMusicRepository;
//
//  @GetMapping("/add")
//  List<UploadMusicEntity> all() {
//	  
//    return uploadMusicRepository.findAll();
//  }
//}