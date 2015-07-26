/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk;

import com.example.typetalk.model.post.Post;
import com.example.typetalk.model.topic.TopicInfo;
import com.example.typetalk.request.message.MessageParameter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Rikiya Kawakami
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clientId = "";
        String clientSecret = "";
        int topicId = 0;

        Client client = new Client(clientId, clientSecret);
        System.out.println(client.getProfile().getAccount().getFullName());
        Post[] posts = client.getPosts(topicId);
        System.out.println(posts.length);
        Post post = posts[0];
        Post postDetail = client.getPost(topicId, post.getId());
        System.out.println(postDetail.getMessage());
        TopicInfo[] topics = client.getTopics().getTopics();
        System.out.println(topics[0].getTopic().getName());
        MessageParameter params = new MessageParameter("Hello, world!", null, null, null, null);
        try {
            System.out.println(client.postMessage(topicId, params).getPost().getMessage());
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
