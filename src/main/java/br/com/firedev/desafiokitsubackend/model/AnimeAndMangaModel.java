package br.com.firedev.desafiokitsubackend.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AnimeAndMangaModel extends BasicInfo{
    private Attributes attributes;
}
