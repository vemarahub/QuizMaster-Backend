package com.vemara.quizapp.objects;

import lombok.Data;

import java.util.List;

@Data
public class UserResponseDTO {
    private Long responseId;
    private String userId;
    private Long quizId;
    private List<QuestionResponseDTO> responses;
    private int score;
}
