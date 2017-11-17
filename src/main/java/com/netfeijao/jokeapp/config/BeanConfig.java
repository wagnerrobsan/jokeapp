package com.netfeijao.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
