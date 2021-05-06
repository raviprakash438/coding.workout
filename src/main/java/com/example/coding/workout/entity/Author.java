package com.example.coding.workout.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Author {
    private String title;
    private String link;
    private String author;
    private int points;
    private int num_comments;
    private String created_date;
    private String created_time;
    private String day_of_the_week;

    public Author(String title, String link, String author,
                  int points, int num_comments, String created_date,
                  String created_time, String day_of_the_week) {
        this.title = title;
        this.link = link;
        this.author = author;
        this.points = points;
        this.num_comments = num_comments;
        this.created_date = created_date;
        this.created_time = created_time;
        this.day_of_the_week = day_of_the_week;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(int num_comments) {
        this.num_comments = num_comments;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getDay_of_the_week() {
        return day_of_the_week;
    }

    public void setDay_of_the_week(String day_of_the_week) {
        this.day_of_the_week = day_of_the_week;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
