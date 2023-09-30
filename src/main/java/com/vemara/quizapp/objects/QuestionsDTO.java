package com.vemara.quizapp.objects;

import lombok.Data;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.List;

@Data
public class QuestionsDTO {
    private Integer questionId;
    private String text;
    private List<AnswerOptionDTO> options;
    private String correctOption;
    private String explanation;
    private Integer quizId;
}
