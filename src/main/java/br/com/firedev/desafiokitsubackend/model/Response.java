package br.com.firedev.desafiokitsubackend.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Response {
    private AnimeAndMangaModel data;
}
