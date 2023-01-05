package com.solatodo.sola_todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SolaTodoAppApplication{

    public static void main(String[] args){
        SpringApplication.run(SolaTodoAppApplication.class,args);
    }

}
