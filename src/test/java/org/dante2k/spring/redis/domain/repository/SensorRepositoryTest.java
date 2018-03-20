package org.dante2k.spring.redis.domain.repository;

import lombok.extern.slf4j.Slf4j;
import org.dante2k.spring.redis.domain.Sensor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SensorRepositoryTest {
  @Autowired
  private SensorRepository sensorRepository;

  @Before
  public void setUp() throws Exception {
    log.info("Put sensor list to redis");
    sensorRepository.save(new Sensor("1", 10F, 20F, 30F));
    sensorRepository.save(new Sensor("2", 11F, 22F, 33F));
    sensorRepository.save(new Sensor("3", 30F, 40F, 23F));
  }

  @Test
  public void testGet() {
    Optional<Sensor> optSensor = sensorRepository.findById("3");
    assertTrue(optSensor.isPresent());
    Sensor sensor = optSensor.get();
    assertNotNull(sensor);
    assertThat(sensor.getId(), is("3"));
    log.info("{}", sensor);

    sensorRepository.save(new Sensor("55", 0F, 0F, 0F));
  }

  @Test
  public void testGetSize() {
    final long count = sensorRepository.count();
    log.info("count = {}", count);
  }
}