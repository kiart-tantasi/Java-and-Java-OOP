package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.ExecutionException;

public class SendHttpRequest {
    private static final String MOCK_URI = "https://lol.petchblog.net/api/v1/matches?gameName=%E0%B9%80%E0%B8%9E%E0%B8%8A%E0%B8%A3&tagLine=ARAM";

    public static void main(String[] args)
            throws MalformedURLException, IOException, URISyntaxException, InterruptedException, ExecutionException {
        System.out.println("=========== LEGACY ===========");
        sendRequestURLConnection();
        System.out.println("=========== MODERN ===========");
        sendRequetHttpClient();
        System.out.println("=========== ASYNC ===========");
        sendRequetHttpClientAsyncThenApply();
    }

    public static void sendRequestURLConnection() throws MalformedURLException, IOException {
        URLConnection conn = new URL(
                MOCK_URI)
                .openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String lineBuffer;
        while ((lineBuffer = bufferedReader.readLine()) != null) {
            System.out.println("response:\n" + lineBuffer);
        }

    }

    public static void sendRequetHttpClient() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(MOCK_URI)).build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println("response:\n" + response.body());
    }

    public static void sendRequetHttpClientAsyncThenApply()
            throws URISyntaxException, IOException, InterruptedException, ExecutionException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(MOCK_URI)).build();
        HttpClient client = HttpClient.newBuilder().build();
        String response = client.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::body).get();
        System.out.println("response(sendAsync):\n" + response);
    }
}
