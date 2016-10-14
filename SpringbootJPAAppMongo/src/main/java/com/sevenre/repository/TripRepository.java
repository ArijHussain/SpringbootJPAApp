package com.sevenre.repository;

import com.sevenre.model.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends MongoRepository<Trip,Long>{
}
