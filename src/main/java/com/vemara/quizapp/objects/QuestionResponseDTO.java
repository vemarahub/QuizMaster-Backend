package com.vemara.quizapp.objects;

import lombok.Data;

@Data
public class QuestionResponseDTO {
    private Long questionId;
    private String selectedOption;
    private boolean isCorrect;
}