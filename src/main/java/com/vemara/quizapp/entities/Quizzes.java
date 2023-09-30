package com.vemara.quizapp.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import org.json.JSONPropertyName;

import java.util.List;

@Data
@Builder
public class Quizzes {
    @JsonProperty("_id")
    Integer id;
    String title;
    String description;
    String createdBy;
    String createdAt;
}
