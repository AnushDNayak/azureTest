package com.example.music.service;

import org.springframework.stereotype.Service;

import com.example.music.model.Music;
import com.example.music.model.MusicFav;

@Service
public interface MusicServiceFav {
	
	public MusicFav saveMusicFav(MusicFav musicFav);

}
