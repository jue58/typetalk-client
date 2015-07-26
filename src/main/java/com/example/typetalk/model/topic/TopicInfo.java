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
public class TopicInfo {
    private Topic topic;
    private boolean favorite;
    private Unread unread;

    public Topic getTopic() {
        return topic;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public Unread getUnread() {
        return unread;
    }
    
}
