package com.example.demo.model;

import com.google.gson.Gson;

import java.time.LocalDate;

public class Post {
    Long id;
    LocalDate postDate;
    String author;
    String title;
    String image;
    String description;
    String category;

    public Post(Long id, LocalDate postDate, String author, String title, String image, String description, String category) {
        this.id = id;
        this.postDate = postDate;
        this.author = author;
        this.title = title;
        this.image = image;
        this.description = description;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toJSON() {
        return new Gson().toJson(this);
    }
}
