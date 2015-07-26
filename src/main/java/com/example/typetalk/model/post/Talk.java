/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.model.post;

/**
 *
 * @author Rikiya Kawakami
 */
public class Talk {
    private int id;
    private int topicId;
    private String name;
    private String suggestion;
    private String createdAt;
    private String updatedAt;
    private String backlog;

    public int getId() {
        return id;
    }

    public int getTopicId() {
        return topicId;
    }

    public String getName() {
        return name;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getBacklog() {
        return backlog;
    }
    
}
