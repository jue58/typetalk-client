/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.request.message;

import com.example.typetalk.request.Parameter;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author Rikiya Kawakami
 */
public class MessageParameter implements Parameter {
    private String message;
    private Integer replyTo;
    private String[] fileKeys;
    private Integer[] talkIds;
    private AttachmentParameter[] attachments;
    
    public MessageParameter() {
    }

    public MessageParameter(String message, Integer replyTo, String[] fileKeys, Integer[] talkIds, AttachmentParameter[] attachments) {
        this.message = message;
        this.replyTo = replyTo;
        this.fileKeys = fileKeys;
        this.talkIds = talkIds;
        this.attachments = attachments;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(int replyTo) {
        this.replyTo = replyTo;
    }

    public String[] getFileKeys() {
        return fileKeys;
    }

    public void setFileKeys(String[] fileKeys) {
        this.fileKeys = fileKeys;
    }

    public Integer[] getTalkIds() {
        return talkIds;
    }

    public void setTalkIds(Integer[] talkIds) {
        this.talkIds = talkIds;
    }

    public AttachmentParameter[] getAttachments() {
        return attachments;
    }

    public void setAttachments(AttachmentParameter[] attachments) {
        this.attachments = attachments;
    }
    
    @Override
    public List<NameValuePair> encode() {
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("message", message));
        if (replyTo != null) {
            params.add(new BasicNameValuePair("replyTo", replyTo.toString()));
        }
        if (fileKeys != null) {
            for (int i = 0; i < fileKeys.length; i++) {
                params.add(new BasicNameValuePair("fileKeys[" + i + "]", fileKeys[i]));
            }
        }
        if (talkIds != null) {
            for (int i = 0; i < talkIds.length; i++) {
                params.add(new BasicNameValuePair("talkIds[" + i + "]", talkIds[i].toString()));
            }
        }
        if (attachments != null) {
            for (int i = 0; i < attachments.length; i++) {
                params.add(new BasicNameValuePair("attachments[" + i + "].fileUrl", attachments[i].getFileUrl()));
                params.add(new BasicNameValuePair("attachments[" + i + "].fileName", attachments[i].getFileName()));
            }
        }
        return params;
    }
}
