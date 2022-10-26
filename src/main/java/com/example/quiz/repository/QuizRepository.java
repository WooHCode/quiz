package com.example.quiz.repository;

import com.example.quiz.entity.Quiz;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

/** Quiz테이블 : RepositoryImpl */
public interface QuizRepository extends CrudRepository<Quiz, Integer> {  //Quiz 는 Member,  Integer 는 primary key
    @Query("SELECT id FROM quiz ORDER BY RANDOM() limit 1")
    Integer getRandomId();
}
