package com.zampettim.springdata.multirepo;

import com.zampettim.springdata.multirepo.repository.jpa.PersonJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MultirepoApplication.class)
public class MultirepoApplicationTests
{
  @Test
  public void contextLoads()
  {
  }
}
