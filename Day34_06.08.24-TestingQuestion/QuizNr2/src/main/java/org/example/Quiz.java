package org.example;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;

    public Quiz() { ArrayList<Question> questions = new ArrayList<>();}

    public void addQuestion(Question question){
        questions.add(question);
    }
    public void askQuestion(User user){

    }
}
