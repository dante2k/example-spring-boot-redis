package org.dante2k.spring.redis.domain;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@NoArgsConstructor
@RedisHash("Sensor")
public class Sensor implements Serializable {
  private String id;

  private Float temperature;

  private Float humidity;

  private Float brightness;

  public Sensor(String id, Float temperature, Float humidity, Float brightness) {
    this.id = id;
    this.temperature = temperature;
    this.humidity = humidity;
    this.brightness = brightness;
  }
}
