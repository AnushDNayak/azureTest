package com.example.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.music.model.Music;
import com.example.music.repo.MusicRepo;

@Service
public class MusicServiceImpl implements MusicService {
	
	@Autowired
	MusicRepo musicRepo;

	@Override
	public Music saveMusic(Music music) {
		// TODO Auto-generated method stub
		return musicRepo.save(music);
	}

	@Override
	public List<Music> getMusics() {
		// TODO Auto-generated method stub
		return musicRepo.findAll();
	}

	@Override
	public List<Music> findByCategory(String category) {
		// TODO Auto-generated method stub
		return musicRepo.findByCategory(category);
	}

}
