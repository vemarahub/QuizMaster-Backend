package com.vemara.quizapp.service;

import com.vemara.quizapp.entities.Quizzes;
import com.vemara.quizapp.objects.QuizDTO;
import com.vemara.quizapp.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RequiredArgsConstructor
@Service
public class QuizService {
    private static final String CLASSNAME = QuizService.class.getName();
    private static final Logger LOGGER = Logger.getLogger(CLASSNAME);

    private final QuizRepository quizRepository;

    public Boolean createQuiz(QuizDTO quizDTO) {
        Quizzes quiz = Quizzes.builder().id(quizDTO.getQuizId()).title(quizDTO.getTitle())
                .description(quizDTO.getDescription())
                .createdAt(DateTime.now().toString()).build();
        quizRepository.save(quiz);
        return true;
    }

    public List<QuizDTO> getAllQuizzes() {
        List<QuizDTO> quizDTOS = new ArrayList<>();
        List<Quizzes> quizzesList = quizRepository.findAll();
        if (!CollectionUtils.isEmpty(quizzesList)) {
            for (Quizzes quizzes : quizzesList) {
                QuizDTO quizDTO = QuizDTO.builder().quizId(quizzes.getId())
                        .description(quizzes.getDescription())
                        .title(quizzes.getTitle()).build();
                quizDTOS.add(quizDTO);
            }
        }
        return quizDTOS;
    }

    public QuizDTO updateQuiz(Long quizId, QuizDTO quiz) {
        return quiz;
    }

    public void deleteQuiz(Long quizId) {
    }
}
