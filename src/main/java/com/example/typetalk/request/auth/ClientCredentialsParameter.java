/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.request.auth;

import com.example.typetalk.request.Parameter;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author Rikiya Kawakami
 */
public class ClientCredentialsParameter implements Parameter {
    private static final String GRANT_TYPE = "client_credentials";
    private static final String SCOPE = "topic.read,topic.post,topic.write,topic.delete,my";
    
    private final String clientId;
    private final String clientSecret;

    public ClientCredentialsParameter(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    @Override
    public List<NameValuePair> encode() {
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("client_id", clientId));
        params.add(new BasicNameValuePair("client_secret", clientSecret));
        params.add(new BasicNameValuePair("grant_type", GRANT_TYPE));
        params.add(new BasicNameValuePair("scope", SCOPE));
        return params;
    }
}
