/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk;

import com.example.typetalk.request.Parameter;
import java.io.UnsupportedEncodingException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/**
 *
 * @author Rikiya Kawakami
 */
 class API extends Connection {
    protected static final String BASE_URL = "https://typetalk.in/api/v1";
    private final Header header;

    public API(String token) {
        header = new BasicHeader("Authorization", "Bearer " + token);
    }
    
    public String get(String path) {
        return get(BASE_URL + path, header);
    }
    
    public String post(String path, Parameter params) throws UnsupportedEncodingException {
        return post(BASE_URL + path, params.encode(), header);
    }
}
