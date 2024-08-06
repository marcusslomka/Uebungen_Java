package org.example;

public class User {
    private String username;
    private int score;

    public User(String username){
        this.username = username;
        this.score = 0;
    }

    public String getUsername(){
        return this.username;
    }
    public int getScore(){
        return this.getScore();
    }
    public void incrementScore(){
        this.score++;
    }

}
