package br.com.firedev.desafiokitsubackend.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ResponseList {
    private List<AnimeAndMangaModel> data;
}
