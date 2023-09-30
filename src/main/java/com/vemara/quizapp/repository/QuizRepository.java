package com.vemara.quizapp.repository;

import com.vemara.quizapp.entities.Quizzes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface QuizRepository extends MongoRepository<Quizzes, Integer> {


}
