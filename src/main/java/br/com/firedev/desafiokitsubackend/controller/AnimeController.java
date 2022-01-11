package br.com.firedev.desafiokitsubackend.controller;

import br.com.firedev.desafiokitsubackend.model.ResponseEpisode;
import br.com.firedev.desafiokitsubackend.model.ResponseList;
import br.com.firedev.desafiokitsubackend.model.Response;
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

    /*
    * Pesquisa um Anime ou um Manga específico por ID (Infotmar no type 'anime' ou 'manga' e o respectivo id).
    * Exemplo de url para consultar anime: localhost:8080/consultById/anime/1
    * Exemplo de url para consultar manga: localhost:8080/consultById/manga/1
    * */
    @GetMapping(value = "/consultById/{type}/{id}")
    public ResponseEntity<Response> getAnimeById(@PathVariable String type, @PathVariable String id) {

        Response anime = this.consumerApiKitsu.consult(type, id);

        return ResponseEntity.ok(anime);
    }

    /*
    * Pesquisa os Animes ou Mangás mais populares.
    * Exemplo de url para consultar Animes mais populares: localhost:8080/consultMostPopular/anime
    * Exemplo de utl para consultar Mangás mais populares: localhost:8080/consultMostPopular/manga
    * */
    @GetMapping(value = "/consultMostPopular/{type}")
    public ResponseEntity<ResponseList> getMostPopularAnimes(@PathVariable String type) {

        ResponseList data = this.consumerApiKitsu.consultMostPopular(type);

        return ResponseEntity.ok(data);
    }

    /*
    * Pesquisa de Anime ou Mangás com filtros.
    * Exemplo de url para consultar Manga com filtro: localhost:8080/filteredSearch/anime/categories/action
    * Exemplo de url para consultar Anime com filtro: localhost:8080/filteredSearch/manga/text/Piece
    * */
    @GetMapping(value = "/filteredSearch/{type}/{filter}/{search}")
    public ResponseEntity<ResponseList> getFilteredSearch(@PathVariable String type, @PathVariable String filter, @PathVariable String search) {

        ResponseList data = this.consumerApiKitsu.filteredSearch(type, filter, search);

        return ResponseEntity.ok(data);

    }

    /*
    * Pesquisa um episódio específico pelo Id
    * Exemplo de url para consultar um episódio: localhost:8080/seachEspecificEpisode/229114
    * */
    @GetMapping(value = "/seachEspecificEpisode/{episodeId}")
    public ResponseEntity<ResponseEpisode> getEspecificEpisode(@PathVariable String episodeId) {

        ResponseEpisode anime = this.consumerApiKitsu.searchSpecificEpisode(episodeId);

        return ResponseEntity.ok(anime);
    }

}
