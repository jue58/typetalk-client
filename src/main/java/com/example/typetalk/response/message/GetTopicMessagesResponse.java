/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.response.message;

import com.example.typetalk.model.post.Post;
import com.example.typetalk.model.topic.Bookmark;
import com.example.typetalk.model.topic.Team;
import com.example.typetalk.model.topic.Topic;

/**
 *
 * @author Rikiya Kawakami
 */
public class GetTopicMessagesResponse {
    private Team team;
    private Topic topic;
    private Bookmark bookmark;
    private Post[] posts;
    private boolean hasNext;

    public Team getTeam() {
        return team;
    }

    public Topic getTopic() {
        return topic;
    }

    public Bookmark getBookmark() {
        return bookmark;
    }
    
    public Post[] getPosts() {
        return posts;
    }
    
    public boolean hasNext() {
        return hasNext;
    }
}
