package com.example.dsl.repository;

import com.example.dsl.model.Cake;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CakeRepository extends CrudRepository<Cake, Long>, QuerydslPredicateExecutor {
}
