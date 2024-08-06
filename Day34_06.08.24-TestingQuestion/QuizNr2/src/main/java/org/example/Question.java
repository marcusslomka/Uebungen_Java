package org.example;

import java.util.List;

public class Question {
    private String description;
    private String[] choices;
    private String[] correctChoices;

    public Question(String description, String[] choices, String[] correctChoices) {
        this.setDescription(description);
        this.setChoices(choices);
        this.setCorrectChoices(correctChoices);
    }

    public boolean answerQuestion(String[] chosen) {
        if(chosen.length != correctChoices.length) {
            return false;
        }
        for(String correctChoice : this.correctChoices) {
            if(List.of(chosen).indexOf(correctChoice) < 0) {
                return false;
            }
        }
        return true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description.length() < 0 || !description.endsWith("?")) {
            throw new IllegalArgumentException("Question description invalid");
        }
        this.description = description;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        if(choices.length < 2) {
            throw new IllegalArgumentException("At least two choices must be provided");
        }
        this.choices = choices;
    }

    public String[] getCorrectChoices() {
        return correctChoices;
    }

    public void setCorrectChoices(String[] correctChoices) {
        if(correctChoices.length < 1 || hasUnknownChoice(this.choices, correctChoices)) {
            throw new IllegalArgumentException("Correct choices must be a subset of choices");
        }
        this.correctChoices = correctChoices;
    }

    private boolean hasUnknownChoice(String[] choices, String[] correctChoices) {
        for(String correctChoice : correctChoices) {
            if(List.of(choices).indexOf(correctChoice) < 0) {
                return true;
            }
        }
        return false;
    }
}
