package br.com.firedev.desafiokitsubackend.configuration;

import br.com.firedev.desafiokitsubackend.service.AnimeService;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public AnimeService animeService(){
        return new AnimeService();
    }
}
