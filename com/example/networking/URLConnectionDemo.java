package com.example.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
    private static final String MOCK_URI = "https://example.com";

    public static void main(String[] args) throws MalformedURLException, IOException {
        sendRequestURLConnection();

    }

    public static void sendRequestURLConnection() throws MalformedURLException, IOException {
        URLConnection conn = new URL(
                MOCK_URI)
                .openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String lineBuffer;
        while ((lineBuffer = bufferedReader.readLine()) != null) {
            System.out.println("LINE: " + lineBuffer);
        }
    }
}
