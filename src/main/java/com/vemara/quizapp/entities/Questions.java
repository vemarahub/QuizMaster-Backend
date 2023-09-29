package com.vemara.quizapp.entities;

import lombok.Data;

import java.util.List;


@Data
public class Questions{
    int question_id;
    String text;
    List<Option> options;
    String correct_option;
    String explanation;
    int quiz_id;

    @Data
    class Option{
        String id;
        String text;
    }
}

