package br.com.firedev.desafiokitsubackend.model;

public class Episode extends BasicInfo{
    private EpisodeAttributes attributes;

    public EpisodeAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(EpisodeAttributes attributes) {
        this.attributes = attributes;
    }
}
