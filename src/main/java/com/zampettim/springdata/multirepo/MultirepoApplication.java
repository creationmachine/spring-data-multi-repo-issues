package com.zampettim.springdata.multirepo;

import com.zampettim.springdata.multirepo.domain.Person;
import com.zampettim.springdata.multirepo.repository.es.PersonESRepository;
import com.zampettim.springdata.multirepo.repository.jpa.PersonJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDateTime;

@EnableElasticsearchRepositories("com.zampettim.springdata.multirepo.repository.es")
@EnableJpaRepositories("com.zampettim.springdata.multirepo.repository.jpa")
@SpringBootApplication
public class MultirepoApplication implements CommandLineRunner
{
  @Autowired
  private PersonESRepository  esRepository;
  @Autowired
  private PersonJpaRepository jpaRepository;

  public static void main(String[] args)
  {
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
    //p.setLastModifiedOn(LocalDateTime.now());
    jpaRepository.save(p);
    esRepository.index(p);

    p = new Person("Daffy", "Duck");
    p.setLastModifiedBy("system");
    //p.setLastModifiedOn(LocalDateTime.now());
    jpaRepository.save(p);
    esRepository.index(p);

    p = new Person("Daisy", "Duck");
    p.setLastModifiedBy("system");
    //p.setLastModifiedOn(LocalDateTime.now());
    jpaRepository.save(p);
    esRepository.index(p);

    jpaRepository.flush();
  }
}
