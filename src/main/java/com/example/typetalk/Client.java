package com.example.typetalk;

import com.example.typetalk.response.message.GetMessageResponse;
import com.example.typetalk.response.message.GetTopicMessagesResponse;
import com.example.typetalk.response.message.GetTopicsResponse;
import com.example.typetalk.model.post.Post;
import com.example.typetalk.model.profile.Profile;
import com.example.typetalk.request.message.MessageParameter;
import com.example.typetalk.response.message.PostMessageResponse;
import com.google.gson.Gson;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Rikiya Kawakami
 */
public class Client {
    private final String clientId;
    private final String clientSecret;
    private final API api;
    private final Gson gson = new Gson();

    public Client(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        String token = null;
        try {
            token = getToken();
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());
        }
        api = new API(token);
    }
    
    private String getToken() throws UnsupportedEncodingException {
        return new AuthAPI(clientId, clientSecret).getAccessToken();
    }
    
    public Profile getProfile() {
        String body = api.get("/profile");
        Profile profle = gson.fromJson(body, Profile.class);
        return profle;
    }
    
    public GetTopicMessagesResponse getTopicMessages(int topicId) {
        String body = api.get("/topics/" + topicId);
        GetTopicMessagesResponse messages = gson.fromJson(body, GetTopicMessagesResponse.class);
        return messages;
    }
    
    public Post[] getPosts(int topicId) {
        return getTopicMessages(topicId).getPosts();
    }
    
    public GetMessageResponse getMessage(int topicId, int postId) {
        String body = api.get("/topics/" + topicId + "/posts/" + postId);
        GetMessageResponse message = gson.fromJson(body, GetMessageResponse.class);
        return message;
    }
    
    public Post getPost(int topicId, int postId) {
        return getMessage(topicId, postId).getPost();
    }
    
    public GetTopicsResponse getTopics() {
        String body = api.get("/topics");
        GetTopicsResponse topics = gson.fromJson(body, GetTopicsResponse.class);
        return topics;
    }
    
    public PostMessageResponse postMessage(int topicId, MessageParameter params) throws UnsupportedEncodingException {
        String body = api.post("/topics/" + topicId, params);
        PostMessageResponse message = gson.fromJson(body, PostMessageResponse.class);
        return message;
    }
}
