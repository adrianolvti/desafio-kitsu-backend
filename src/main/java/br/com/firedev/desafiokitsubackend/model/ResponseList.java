package br.com.firedev.desafiokitsubackend.model;

import java.util.List;

public class ResponseList {
    private List<AnimeAndMangaModel> data;

    public List<AnimeAndMangaModel> getData() {
        return data;
    }

    public void setData(List<AnimeAndMangaModel> data) {
        this.data = data;
    }
}
