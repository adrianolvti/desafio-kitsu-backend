package br.com.firedev.desafiokitsubackend.service;

import br.com.firedev.desafiokitsubackend.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ConsumerApiKitsu {

    @Autowired
    private WebClient webClient;

    public Data consultAnime(String codesAnime) {

        Mono<Data> monoData = this.webClient
                .method(HttpMethod.GET)
                .uri("/anime/{code}", codesAnime)
                .retrieve()
                .bodyToMono(Data.class);

        Data data = monoData.block();

        System.out.println(data);

        return data;
    }
}
