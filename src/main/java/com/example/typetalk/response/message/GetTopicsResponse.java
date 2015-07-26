/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.response.message;

import com.example.typetalk.model.topic.TopicInfo;

/**
 *
 * @author Rikiya Kawakami
 */
public class GetTopicsResponse {
    private TopicInfo[] topics;

    public TopicInfo[] getTopics() {
        return topics;
    }
}
