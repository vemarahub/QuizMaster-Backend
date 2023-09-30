package com.vemara.quizapp.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vemara.quizapp.objects.AnswerOptionDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONPropertyName;

import java.util.List;

@Builder
@Data
public class Questions{
    @JsonProperty("_id")
    QuestionKey id;
    String text;
    List<AnswerOptionDTO> options;
    String correctOption;
    String explanation;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class QuestionKey{
        int questionId;
        int quizId;
    }

}



