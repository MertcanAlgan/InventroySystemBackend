package com.example.stoktakip.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AdminConfig {
    @Autowired
    @Bean
    CommandLineRunner commandLineRunner3(AdminRepository repository){
        return args -> {
            Admin admin = new Admin("39263213964","kolaysoft");
            repository.save(admin);
        };
    }
}
