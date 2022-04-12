package com.Jvnyor.testbot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jvnyor.testbot.model.Info;
import com.Jvnyor.testbot.repository.InfoRepository;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoRepository infoRepository;
	
	@PostMapping
	public ResponseEntity<Void> save(Info info) {
		infoRepository.save(info);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Info>> getAll(){
		return ResponseEntity.ok(infoRepository.findAll());
	}
}
