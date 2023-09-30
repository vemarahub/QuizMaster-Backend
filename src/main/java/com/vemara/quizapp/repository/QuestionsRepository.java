package com.vemara.quizapp.repository;

import com.vemara.quizapp.entities.Questions;
import com.vemara.quizapp.entities.Quizzes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface QuestionsRepository extends MongoRepository<Questions, Integer> {

    @Query
    List<Quizzes> findByQuizId(Integer quizId);

}
