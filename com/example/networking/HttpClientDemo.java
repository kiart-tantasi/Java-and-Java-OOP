package com.example.networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.ExecutionException;

public class HttpClientDemo {
    private static final String MOCK_URI = "https://example.com";

    public static void main(String[] args)
            throws MalformedURLException, IOException, URISyntaxException, InterruptedException, ExecutionException {
        System.out.println("=========== SYNC ===========");
        sendRequetHttpClient();
        // System.out.println("=========== ASYNC (ThenApply) ===========");
        // sendRequetHttpClientAsyncThenApply();
        // System.out.println("=========== ASYNC (ThenAccept) ===========");
        // sendRequetHttpClientAsyncThenAccept();
    }

    public static void sendRequetHttpClient() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(MOCK_URI)).build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        if (response.statusCode() == 200) {
            System.out.println("BODY:");
            System.out.println(response.body());
        } else {
            System.out.println("status is not 200");
        }
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
