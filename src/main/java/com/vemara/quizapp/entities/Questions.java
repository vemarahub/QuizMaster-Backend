package com.vemara.quizapp.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vemara.quizapp.objects.AnswerOptionDTO;
import lombok.Builder;
import lombok.Data;
import org.json.JSONPropertyName;

import java.util.List;

@Builder
@Data
public class Questions{
    @JsonProperty("_id")
    int id;
    String text;
    List<AnswerOptionDTO> options;
    String correctOption;
    String explanation;
    int quizId;
}

