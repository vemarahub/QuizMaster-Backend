package com.vemara.quizapp.objects;

import lombok.Data;

@Data
public class AnswerOptionDTO {
    private String id; // A, B, C, D, etc.
    private String text;
}
