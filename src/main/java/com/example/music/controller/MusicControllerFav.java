package com.example.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.music.model.Music;
import com.example.music.model.MusicFav;
import com.example.music.service.MusicService;
import com.example.music.service.MusicServiceFav;

@CrossOrigin
@RequestMapping("musicFav")
@RestController
public class MusicControllerFav {
	
	@Autowired
	MusicServiceFav musicServiceFav;
	
	@PostMapping
	public ResponseEntity<MusicFav> saveMusicFav(@RequestBody MusicFav musicFav)
	{
		MusicFav saveMusicFav= musicServiceFav.saveMusicFav(musicFav);
		
		return new ResponseEntity<MusicFav>(saveMusicFav,HttpStatus.OK);
	}
	

}
