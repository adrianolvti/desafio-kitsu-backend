package br.com.firedev.desafiokitsubackend.controller;

import br.com.firedev.desafiokitsubackend.model.Data;
import br.com.firedev.desafiokitsubackend.service.ConsumerApiKitsu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimeController {

    @Autowired
    private ConsumerApiKitsu consumerApiKitsu;

    @GetMapping(value = "/anime/{codigoAnime}")
    public ResponseEntity<Data> getAnimeById(@PathVariable String codigoAnime) {

        Data data = this.consumerApiKitsu.consultAnime(codigoAnime); //????????????????

        return ResponseEntity.ok(data);
    }

}
