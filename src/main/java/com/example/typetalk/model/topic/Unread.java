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
public class Unread {
    private int topicId;
    private int postId;
    private int count;

    public int getTopicId() {
        return topicId;
    }

    public int getPostId() {
        return postId;
    }

    public int getCount() {
        return count;
    }
}
