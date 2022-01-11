package br.com.firedev.desafiokitsubackend.service;

import br.com.firedev.desafiokitsubackend.model.ResponseEpisode;
import br.com.firedev.desafiokitsubackend.model.ResponseList;
import br.com.firedev.desafiokitsubackend.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ConsumerApiKitsu {

    //Injetando o Bean criado na classe Main
    @Autowired
    private WebClient webClient;

    // Retorna um anime ou um mangá por ID
    public Response consult(String type, String id) {

        Mono<Response> monoData = this.webClient
                .method(HttpMethod.GET)
                .uri("/{type}/{code}", type, id)
                .retrieve() // Dispara a requisição Http
                .bodyToMono(Response.class);

        Response data = monoData.block();

        return data;
    }

    // Retorna uma lista com os animes ou mangás mais populares
    public ResponseList consultMostPopular(String type) {

        Mono<ResponseList> monoData = this.webClient
                .method(HttpMethod.GET)
                .uri("/trending/{type}", type)
                .retrieve()
                .bodyToMono(ResponseList.class);

        ResponseList data = monoData.block();

        return data;

    }

    // Retorna uma pesquisa com filtro de Animes ou Mangás
    public ResponseList filteredSearch(String type, String filter, String search) {

        Mono<ResponseList> monoData = this.webClient
                .method(HttpMethod.GET)
                .uri("/{type}?filter[{filter}]={search}", type, filter, search)
                .retrieve()
                .bodyToMono(ResponseList.class);

        ResponseList data = monoData.block();

        return data;

    }

    // Retorna informações de um episódio específico
    public ResponseEpisode searchSpecificEpisode(String episodeId) {
        Mono<ResponseEpisode> monoData = this.webClient
                .method(HttpMethod.GET)
                .uri("/episodes/{episodeId}", episodeId)
                .retrieve()
                .bodyToMono(ResponseEpisode.class);

        ResponseEpisode data = monoData.block();

        return data;
    }

}
