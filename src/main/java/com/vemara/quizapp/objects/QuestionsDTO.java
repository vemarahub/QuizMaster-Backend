package com.vemara.quizapp.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionsDTO {
    private Integer questionId;
    private String text;
    private List<AnswerOptionDTO> options;
    private String correctOption;
    private String explanation;
    private Integer quizId;
}
