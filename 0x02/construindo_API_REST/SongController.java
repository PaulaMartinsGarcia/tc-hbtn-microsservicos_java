package com.paula.song.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.paula.song.model.Song;
import com.paula.song.repository.SongRepository;

@RestController
@RequestMapping
public class SongController {
	
	 @Autowired
     private SongRepository songRepository;
	 
     @GetMapping("/welcome")
     public String mensagemBoasVindas() {
		return "Bem vindo a API Song";
        
     }

     @GetMapping("/allSongs")
     public List<Song> getAllSongs() {
		return songRepository.getAllSongs();
   
     }

    @GetMapping("/findSong/{id}")
     public Song findSongById(@PathVariable Integer id) {
        return songRepository.getSongById(id);
    	
     }

     @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
     @ResponseStatus(HttpStatus.CREATED)
     public Song addSong(@RequestBody Song song) {
		 songRepository.addSong(song);
          return song;
     }

     @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
   public Song updateSong(@RequestBody Song song) {
		 songRepository.updateSong(song);
          return song;
}

     @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
     public void deleteSongById(@RequestBody Song song) {
          songRepository.removeSong(song);
     }
}
