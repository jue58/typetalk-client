/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.request.auth;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rikiya Kawakami
 */
public class ClientCredentialsParameterTet {
    
    public ClientCredentialsParameterTet() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEncode() {
        ClientCredentialsParameter params = new ClientCredentialsParameter("client_id", "client_secret");
        List<NameValuePair> expected = new ArrayList<>();
        expected.add(new BasicNameValuePair("client_id", "client_id"));
        expected.add(new BasicNameValuePair("client_secret", "client_secret"));
        expected.add(new BasicNameValuePair("grant_type", "client_credentials"));
        expected.add(new BasicNameValuePair("scope", "topic.read,topic.post,topic.write,topic.delete,my"));
        
        assertThat(params.encode(), is(expected));
    }
}
