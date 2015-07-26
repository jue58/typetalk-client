/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.model.link;

/**
 *
 * @author Rikiya Kawakami
 */
public class Link {
    private int id;
    private String url;
    private String contentType;
    private String title;
    private String description;
    private String imageUrl;
    private Embed embed;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getContentType() {
        return contentType;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Embed getEmbed() {
        return embed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
