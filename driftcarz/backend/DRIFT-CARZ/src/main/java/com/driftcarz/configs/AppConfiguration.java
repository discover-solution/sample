package com.driftcarz.configs;

import com.driftcarz.repo.AppRepository;
import com.driftcarz.repo.impl.AppRepositoryImpl;
import com.driftcarz.service.AppService;
import com.driftcarz.service.impl.AppServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public AppService appService(){
        return new AppServiceImpl();
    }

    @Bean
    public AppRepository appRepository(){
        return new AppRepositoryImpl();
    }
}
