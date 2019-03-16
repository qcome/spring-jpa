package com.example.demo.init;

import com.example.demo.entity.Evenement;
import com.example.demo.repository.EvenementRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataEvenementsInit implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(DataEvenementsInit.class);

    @Autowired
    EvenementRepository evenementRepository;



    @Override
    public void run(ApplicationArguments args) {
        evenementRepository.save(new Evenement("douze"));
    }



}
