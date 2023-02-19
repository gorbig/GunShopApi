package com.example.endtermnosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EndtermNoSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndtermNoSqlApplication.class, args);


    }

}