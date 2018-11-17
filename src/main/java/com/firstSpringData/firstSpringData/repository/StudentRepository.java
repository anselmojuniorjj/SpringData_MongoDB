package com.firstSpringData.firstSpringData.repository;

import com.firstSpringData.firstSpringData.entity.Students;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Students, String> {

    public List<Students> findByNameLikeIgnoreCase(String name);
}
