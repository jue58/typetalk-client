/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.model.post;

import com.example.typetalk.model.attachment.Attachment;
import com.example.typetalk.model.link.Link;
import com.example.typetalk.model.profile.Account;

/**
 *
 * @author Rikiya Kawakami
 */
public class Post {
    private int id;
    private int topicId;
    private int replyTo;
    private String message;
    private Account account;
    private String mention;
    private Attachment[] attachments;
    private Like[] likes;
    private Talk[] talks;
    private Link[] links;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public int getTopicId() {
        return topicId;
    }

    public int getReplyTo() {
        return replyTo;
    }

    public String getMessage() {
        return message;
    }

    public Account getAccount() {
        return account;
    }

    public String getMention() {
        return mention;
    }

    public Attachment[] getAttachments() {
        return attachments;
    }

    public Like[] getLikes() {
        return likes;
    }

    public Talk[] getTalks() {
        return talks;
    }

    public Link[] getLinks() {
        return links;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
