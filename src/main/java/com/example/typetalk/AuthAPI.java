package com.example.typetalk;

import com.example.typetalk.request.auth.ClientCredentialsParameter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 *
 * @author Rikiya Kawakami
 */
class AuthAPI extends Connection {
    private static final String AUTH_URL = "https://typetalk.in/oauth2/access_token";
    private final ClientCredentialsParameter params;
    
    public AuthAPI(String clientId, String clientSecret) {
        params = new ClientCredentialsParameter(clientId, clientSecret);
    }
    
    public String getAccessToken() throws UnsupportedEncodingException {
        String body = post(AUTH_URL, params.encode(), null);
        Map<String, String> data = new Gson().fromJson(body, new TypeToken<Map<String, String>>(){}.getType());
        return data.get("access_token");
    }
}
