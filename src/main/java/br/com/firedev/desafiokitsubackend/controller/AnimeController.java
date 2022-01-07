package br.com.firedev.desafiokitsubackend.controller;

import br.com.firedev.desafiokitsubackend.model.Anime;
import br.com.firedev.desafiokitsubackend.service.ConsumerApiKitsu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimeController {

    @Autowired
    private ConsumerApiKitsu service;

    @GetMapping(value = "/searchAnime")
    public void getAnimeById() {
        Anime anime = service.consultAnime("anime?filter[id]=1");
        System.out.println(anime);
    }
}
