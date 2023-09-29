package com.vemara.quizapp.service;

import com.vemara.quizapp.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;

@RequiredArgsConstructor
@Service
public class QuizService {
    private static final String CLASSNAME = QuizService.class.getName();
    private static final Logger LOGGER = Logger.getLogger(CLASSNAME);

    private final QuizRepository quizRepository;

    private final MongoTemplate mongoTemplate;




}
