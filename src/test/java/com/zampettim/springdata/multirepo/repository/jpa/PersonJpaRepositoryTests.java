package com.zampettim.springdata.multirepo.repository.jpa;

import com.zampettim.springdata.multirepo.MultirepoApplication;
import com.zampettim.springdata.multirepo.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MultirepoApplication.class)
public class PersonJpaRepositoryTests
{
  @Autowired
  private PersonJpaRepository repository;

  @Test
  public void testFindAll()
  {
    final List<Person> persons = repository.findAll();

    assertNotNull(persons);
    assertNotEquals(0, persons.size());

    for(final Person person : persons)
    {
      assertNotNull(person);
      assertNotNull(person.getEntityId());
      assertNotNull(person.getFirstName());
      assertNotNull(person.getLastName());
      assertNotNull(person.getLastModifiedBy());
    }
  }
}
