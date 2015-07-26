/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.model.topic;

/**
 *
 * @author Rikiya Kawakami
 */
public class Topic {
    private int id;
    private String name;
    private String suggestion;
    private String lastPostedAt;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public String getLastPostedAt() {
        return lastPostedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
