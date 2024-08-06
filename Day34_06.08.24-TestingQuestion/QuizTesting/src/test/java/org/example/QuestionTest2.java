package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
class QuestionTest2 {

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
