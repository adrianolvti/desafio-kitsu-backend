package br.com.firedev.desafiokitsubackend.service;

import br.com.firedev.desafiokitsubackend.model.Anime;
import org.springframework.web.reactive.function.client.WebClient;

public class AnimeService {

    public Anime[] returnAnimes() {

        //https://kitsu.io/api/edge/anime
        String url = "https://kitsu.io";
        String uri = "/api/edge";

        Anime[] animes = WebClient
                .create(url)
                .get()
                .uri(uri)
                .retrieve()
                .bodyToMono(Anime[].class).block();

        return animes;
    }

}
