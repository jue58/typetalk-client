/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.model.profile;

/**
 *
 * @author Rikiya Kawakami
 */
public class Account {
    private int id;
    private String name;
    private String fullName;
    private String suggestion;
    private String imageUrl;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
