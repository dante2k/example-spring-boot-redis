package org.dante2k.spring.redis.domain.repository;

import org.dante2k.spring.redis.domain.Sensor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends CrudRepository<Sensor, String> {
}
