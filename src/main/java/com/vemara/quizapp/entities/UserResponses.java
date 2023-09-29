package com.vemara.quizapp.entities;

import lombok.Data;

import java.util.List;

@Data
class UserResponses {
    int response_id;
    String user_id;
    int quiz_id;
    List<Response> responses;
    int score;
    String submitted_at;

    @Data
    class Response{
        public int question_id;
        public String selected_option;
        public boolean is_correct;
    }
}
