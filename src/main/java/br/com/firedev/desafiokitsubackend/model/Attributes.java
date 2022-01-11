package br.com.firedev.desafiokitsubackend.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Attributes {
    private String description;

    @JsonProperty("canonicalTitle")
    private String name;
}
