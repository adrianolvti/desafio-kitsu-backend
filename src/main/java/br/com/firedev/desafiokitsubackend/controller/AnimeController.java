package br.com.firedev.desafiokitsubackend.controller;

import br.com.firedev.desafiokitsubackend.model.Anime;
import br.com.firedev.desafiokitsubackend.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @GetMapping("/1")
    public ResponseEntity consultarAnimes(){
        Anime[] anime = animeService.returnAnimes();

        return ResponseEntity.ok(anime);
    }

}
