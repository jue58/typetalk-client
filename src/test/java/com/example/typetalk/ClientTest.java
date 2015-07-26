/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk;

import com.example.typetalk.request.message.MessageParameter;
import com.example.typetalk.response.message.PostMessageResponse;
import java.io.UnsupportedEncodingException;
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
public class ClientTest {
    
    public ClientTest() {
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
    public void testPostMessage() {
//        Client client = new Client("client_id", "client_secret");
//        MessageParameter params = new MessageParameter("test_message", null, null, null, null);
//        String expected = "test_message";
//        try {
//            PostMessageResponse response = client.postMessage(1, params);
//            assertThat(response.getPost().getMessage(), is(expected));
//        } catch (UnsupportedEncodingException ex) {
//            fail();
//        }
    }
}
