/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.response.message;

import com.example.typetalk.model.post.Post;
import com.example.typetalk.model.topic.Topic;

/**
 *
 * @author Rikiya Kawakami
 */
public class PostMessageResponse {
    private Topic topic;
    private Post post;

    public Topic getTopic() {
        return topic;
    }

    public Post getPost() {
        return post;
    }
    
}
