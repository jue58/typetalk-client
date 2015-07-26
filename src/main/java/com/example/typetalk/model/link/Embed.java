/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.typetalk.model.link;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Rikiya Kawakami
 */
public class Embed {
    private String type;
    private String version;
    @SerializedName("provider_name")
    private String providerName;
    @SerializedName("provider_url")
    private String providerUrl;
    private String title;
    @SerializedName("author_name")
    private String authorName;
    @SerializedName("author_url")
    private String authorUrl;
    private String html;
    private int width;
    private int height;

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getProviderUrl() {
        return providerUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public String getHtml() {
        return html;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
