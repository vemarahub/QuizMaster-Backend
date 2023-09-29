package com.vemara.quizapp.repository;

import com.vemara.quizapp.entities.Quizes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface QuizRepository extends MongoRepository<Quizes, Integer> {

    @Query
    List<Quizes> findByQuizId(Integer quizId);

}
