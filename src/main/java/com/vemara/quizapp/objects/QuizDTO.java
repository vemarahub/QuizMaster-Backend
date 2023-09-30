package com.vemara.quizapp.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuizDTO {
    private Integer quizId;
    private String title;
    private String description;
}
