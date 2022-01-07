package br.com.firedev.desafiokitsubackend.service;

import br.com.firedev.desafiokitsubackend.model.Anime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerApiKitsu {

    @Value("${url.kitsu}")
    private String url;

    public Anime consultAnime(String uri) {
        String fullUrl = url + uri;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(fullUrl, Anime.class);
    }
}
