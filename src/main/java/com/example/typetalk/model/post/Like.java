/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.model.post;

import com.example.typetalk.model.profile.Account;

/**
 *
 * @author Rikiya Kawakami
 */
public class Like {
    private int id;
    private int postId;
    private int topicId;
    private String comment;
    private Account account;

    public int getId() {
        return id;
    }

    public int getPostId() {
        return postId;
    }

    public int getTopicId() {
        return topicId;
    }

    public String getComment() {
        return comment;
    }

    public Account getAccount() {
        return account;
    }
    
}
