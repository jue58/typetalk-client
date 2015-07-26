/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.response.message;

import com.example.typetalk.model.post.Post;
import com.example.typetalk.model.topic.Team;
import com.example.typetalk.model.topic.Topic;

/**
 *
 * @author Rikiya Kawakami
 */
public class GetMessageResponse {
    private Team team;
    private Topic topic;
    private Post post;
    private Post[] replies;

    public Team getTeam() {
        return team;
    }

    public Topic getTopic() {
        return topic;
    }

    public Post getPost() {
        return post;
    }

    public Post[] getReplies() {
        return replies;
    }
}
