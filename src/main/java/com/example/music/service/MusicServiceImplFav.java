package com.example.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.music.model.Music;
import com.example.music.model.MusicFav;
import com.example.music.repo.MusicRepo;
import com.example.music.repo.MusicRepoFav;

@Service
public class MusicServiceImplFav implements MusicServiceFav {
	
	@Autowired
	MusicRepoFav musicRepoFav;

	@Override
	public MusicFav saveMusicFav(MusicFav musicFav) {
		// TODO Auto-generated method stub
		return musicRepoFav.save(musicFav);
	}

}
