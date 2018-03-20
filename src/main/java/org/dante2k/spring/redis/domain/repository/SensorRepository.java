package org.dante2k.spring.redis.domain.repository;

import org.dante2k.spring.redis.domain.Sensor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SensorRepository extends PagingAndSortingRepository<Sensor, String> {
}
