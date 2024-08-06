package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class QuestionTest {
    private String question;
    private String[] choices;
    private String[] correctChoice;
    @BeforeAll
    void setupQuestionTestData(){
        this.question = ("Which one is not a fish?");
        this.choices = new String[]{
                "Forelle",
                "Dachs",
                "Wels",
                "Karpfen"
        };
        this.correctChoice = new String[] {"Dachs"};
    }
    @Test
    void throwSetDiscription(){
        assertThrows(IllegalArgumentException.class,()->{
            new Question("hallo",this.choices,this.correctChoice);
        });
    }
}