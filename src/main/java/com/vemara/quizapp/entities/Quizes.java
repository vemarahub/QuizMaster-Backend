package com.vemara.quizapp.entities;

import lombok.Data;

import java.util.List;

@Data
public class Quizes {
    Integer quizId;
    String title;
    String description;
    List<Integer> questions;
    String createdBy;
    String createdAt;
}
