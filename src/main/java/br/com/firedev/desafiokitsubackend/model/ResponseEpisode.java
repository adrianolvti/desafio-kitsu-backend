package br.com.firedev.desafiokitsubackend.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

public class ResponseEpisode {
    private Episode data;

    public Episode getData() {
        return data;
    }

    public void setData(Episode data) {
        this.data = data;
    }
}
