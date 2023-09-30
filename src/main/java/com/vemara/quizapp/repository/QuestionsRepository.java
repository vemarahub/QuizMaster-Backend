package com.vemara.quizapp.repository;

import com.vemara.quizapp.entities.Questions;
import com.vemara.quizapp.entities.Quizzes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface QuestionsRepository extends MongoRepository<Questions, Integer> {

    @Query("{'_id.quizId': ?0}")
    List<Questions> findAllByQuizId(Integer quizId);

}
