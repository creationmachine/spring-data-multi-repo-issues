package com.zampettim.springdata.multirepo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zampettim.springdata.multirepo.domain.Person;
import com.zampettim.springdata.multirepo.repository.jpa.PersonJpaRepository;

@SpringBootApplication
public class MultirepoApplication implements CommandLineRunner {

    @Autowired
    private PersonJpaRepository jpaRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(MultirepoApplication.class, args);

    }
    
    @Override
    public void run(String... args) throws Exception
    {
        initData();
    }
    
    private void initData()
    {
        jpaRepository.deleteAll();
        
        Person p = new Person("Donald", "Duck");
        p.setLastModifiedBy("system");
        p.setLastModifiedOn(LocalDateTime.now());
        jpaRepository.save(p);

        p = new Person("Daffy", "Duck");
        p.setLastModifiedBy("system");
        p.setLastModifiedOn(LocalDateTime.now());
        jpaRepository.save(p);

        p = new Person("Daisy", "Duck");
        p.setLastModifiedBy("system");
        p.setLastModifiedOn(LocalDateTime.now());
        jpaRepository.save(p);

        jpaRepository.flush();
    }
}
