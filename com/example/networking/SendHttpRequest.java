package com.example.networking;

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
    private static final String MOCK_URI = "https://example.com";

    public static void main(String[] args)
            throws MalformedURLException, IOException, URISyntaxException, InterruptedException, ExecutionException {
        System.out.println("=========== LEGACY ===========");
        sendRequestURLConnection();
        System.out.println("=========== MODERN ===========");
        sendRequetHttpClient();
        System.out.println("=========== ASYNC (ThenApply) ===========");
        sendRequetHttpClientAsyncThenApply();
        System.out.println("=========== ASYNC (ThenAccept) ===========");
        sendRequetHttpClientAsyncThenAccept();
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

    public static void sendRequetHttpClient() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(MOCK_URI)).build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println("status: " + response.statusCode());
    }

    // this is not a good file to demo `Then...()` but let put it here first

    public static void sendRequetHttpClientAsyncThenApply()
            throws URISyntaxException, IOException, InterruptedException, ExecutionException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(MOCK_URI)).build();
        HttpClient client = HttpClient.newBuilder().build();
        String statusCode = client.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::statusCode).get()
                .toString();
        System.out.println("response status:" + statusCode);
    }

    public static void sendRequetHttpClientAsyncThenAccept()
            throws URISyntaxException, IOException, InterruptedException, ExecutionException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(MOCK_URI)).build();
        HttpClient client = HttpClient.newBuilder().build();
        client.sendAsync(request, BodyHandlers.ofString()).thenAccept(res -> {
            System.out.println("response status:" + res.statusCode());
        }).get();
    }
}
