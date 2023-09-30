package com.vemara.quizapp.service;

import com.vemara.quizapp.entities.Questions;
import com.vemara.quizapp.objects.QuestionsDTO;
import com.vemara.quizapp.objects.QuizDTO;
import com.vemara.quizapp.repository.QuestionsRepository;
import com.vemara.quizapp.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private static final String CLASSNAME = QuestionService.class.getName();
    private static final Logger LOGGER = Logger.getLogger(CLASSNAME);

    private final QuestionsRepository questionsRepository;

    public Boolean createQuestions(List<QuestionsDTO> questionsDTOList) {
        List<Questions> questionsList = new ArrayList<>();
        for(QuestionsDTO questionDTO: questionsDTOList) {
            Questions questions = Questions.builder().id(questionDTO.getQuestionId())
                    .quizId(questionDTO.getQuizId())
                    .text(questionDTO.getText())
                    .correctOption(questionDTO.getCorrectOption())
                    .explanation(questionDTO.getExplanation())
                    .options(questionDTO.getOptions()).build();
            questionsList.add(questions);
        }
        if(!CollectionUtils.isEmpty(questionsList)) {
            questionsRepository.saveAll(questionsList);
        }
        return true;
    }

    public QuestionsDTO getQuestionById(Long questionId) {
        return null;
    }
}
