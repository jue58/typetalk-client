/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.request.message;

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
public class MessageParameterTest {
    
    public MessageParameterTest() {
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
        String[] fileKeys = new String[] {"key1", "key2", "key3", "key4", "key5"};
        Integer[] talkIds = new Integer[] {1, 2, 3, 4, 5};
        AttachmentParameter[] attachments = new AttachmentParameter[] {
            new AttachmentParameter("fileUrl1", "fileName1"),
            new AttachmentParameter("fileUrl2", "fileName2"),
            new AttachmentParameter("fileUrl3", "fileName3"),
            new AttachmentParameter("fileUrl4", "fileName4"),
            new AttachmentParameter("fileUrl5", "fileName5")
        };
        MessageParameter params = new MessageParameter("test", 1, fileKeys, talkIds, attachments);
        List<NameValuePair> expected = new ArrayList<>();
        expected.add(new BasicNameValuePair("message", "test"));
        expected.add(new BasicNameValuePair("replyTo", "1"));
        expected.add(new BasicNameValuePair("fileKeys[0]", "key1"));
        expected.add(new BasicNameValuePair("fileKeys[1]", "key2"));
        expected.add(new BasicNameValuePair("fileKeys[2]", "key3"));
        expected.add(new BasicNameValuePair("fileKeys[3]", "key4"));
        expected.add(new BasicNameValuePair("fileKeys[4]", "key5"));
        expected.add(new BasicNameValuePair("talkIds[0]", "1"));
        expected.add(new BasicNameValuePair("talkIds[1]", "2"));
        expected.add(new BasicNameValuePair("talkIds[2]", "3"));
        expected.add(new BasicNameValuePair("talkIds[3]", "4"));
        expected.add(new BasicNameValuePair("talkIds[4]", "5"));
        expected.add(new BasicNameValuePair("attachments[0].fileUrl", "fileUrl1"));
        expected.add(new BasicNameValuePair("attachments[0].fileName", "fileName1"));
        expected.add(new BasicNameValuePair("attachments[1].fileUrl", "fileUrl2"));
        expected.add(new BasicNameValuePair("attachments[1].fileName", "fileName2"));
        expected.add(new BasicNameValuePair("attachments[2].fileUrl", "fileUrl3"));
        expected.add(new BasicNameValuePair("attachments[2].fileName", "fileName3"));
        expected.add(new BasicNameValuePair("attachments[3].fileUrl", "fileUrl4"));
        expected.add(new BasicNameValuePair("attachments[3].fileName", "fileName4"));
        expected.add(new BasicNameValuePair("attachments[4].fileUrl", "fileUrl5"));
        expected.add(new BasicNameValuePair("attachments[4].fileName", "fileName5"));

        assertThat(params.encode(), is(expected));
    }
    
    @Test
    public void testEncode_MessageOnly() {
        MessageParameter params = new MessageParameter("test", null, null, null, null);
        List<NameValuePair> expected = new ArrayList<>();
        expected.add(new BasicNameValuePair("message", "test"));
        
        assertThat(params.encode(), is(expected));
    }
    
}
