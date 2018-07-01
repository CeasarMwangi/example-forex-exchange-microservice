package com.in28minutes.springboot.microservice.example.forex;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * We are extending JpaRepository using two generics - ExchangeValue & Long. 
 * ExchangeValue is the entity that is being managed and the primary key of ExchangeValue is Long.
 * 
 * @author kanja
 *
 */
public interface ExchangeValueRepository extends 
    JpaRepository<ExchangeValue, Long>{
  ExchangeValue findByFromAndTo(String from, String to);
}