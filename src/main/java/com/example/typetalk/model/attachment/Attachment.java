/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.model.attachment;

import com.example.typetalk.model.attachment.AttachmentDetail;

/**
 *
 * @author Rikiya Kawakami
 */
public class Attachment {
    private AttachmentDetail attachment;
    private String webUrl;
    private String apiUrl;
    private Thumbnail[] thumbnails;

    public AttachmentDetail getAttachment() {
        return attachment;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public Thumbnail[] getThumbnails() {
        return thumbnails;
    }
    
}
