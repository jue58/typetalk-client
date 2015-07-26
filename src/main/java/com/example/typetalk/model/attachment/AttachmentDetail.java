/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.model.attachment;

/**
 *
 * @author Rikiya Kawakami
 */
public class AttachmentDetail {
    private String contentType;
    private String fileKey;
    private String fileName;
    private int fileSize;

    public String getContentType() {
        return contentType;
    }

    public String getFileKey() {
        return fileKey;
    }

    public String getFileName() {
        return fileName;
    }

    public int getFileSize() {
        return fileSize;
    }
}
