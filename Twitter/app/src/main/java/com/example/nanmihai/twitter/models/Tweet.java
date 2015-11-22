package com.example.nanmihai.twitter.models;

/**
 * Created by Nan Mihai on 13.11.2015.
 */
public class Tweet {
    private String author; //numele intreg
    private String username; //@blaba..
    private String body;
    private String date = "14.11.2015";
    private String title;

    public Tweet(String author, String username){
        this.author = author;
        this.username = username;
        this.title = author;
    }

    public Tweet(String author, String username, String text){
        this.author = author;
        this.username = username;
        this.body = text;
        this.title = author;
    }

    public void setBody(String text){
        this.body = text;
    }

    public String getBody() {
        return this.body;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDate() {
        return this.date;
    }

    public String toString() {
        return author + " " + username + "\n" + body;
    }
}
