package com.example.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.music.model.Music;
import com.example.music.service.MusicService;


@CrossOrigin
@RequestMapping("music")
@RestController
public class MusicController {
	
	@Autowired
	MusicService musicService;
	
	@PostMapping
	public ResponseEntity<Music> saveMusic(@RequestBody Music music)
	{
		Music saveMusic= musicService.saveMusic(music);
		
		return new ResponseEntity<Music>(saveMusic,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Music>> getMusics()
	{
	
	List<Music> musics=musicService.getMusics();
		
		return new ResponseEntity<List<Music>>(musics,HttpStatus.OK);
		
	}
	@GetMapping("filter/{category}")
	public ResponseEntity<List<Music>> getByCategory(@PathVariable String category)
	{
	
	List<Music> musics=musicService.findByCategory(category);
		
		return new ResponseEntity<List<Music>>(musics,HttpStatus.OK);
		
	}

}
