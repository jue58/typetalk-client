package com.example.typetalk;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Rikiya Kawakami
 */
abstract class Connection {    
    protected String get(String url, Header header) {
        return request(new HttpGet(url), header);
    }
    
    protected String post(String url, List<NameValuePair> params, Header header) throws UnsupportedEncodingException {
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(entity);
        return request(httpPost, header);
    }

    private String request(HttpUriRequest method, Header header) {
        String body = null;
        method.addHeader(header);
        try(CloseableHttpClient client = HttpClientBuilder.create().build()) {
            try (CloseableHttpResponse response = client.execute(method)) {
                body = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return body;
    }
}
