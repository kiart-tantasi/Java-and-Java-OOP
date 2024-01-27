package com.example;

import java.io.IOException;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args) throws IOException {
        // create a socket to connect to a server
        try (Socket socket = new Socket("www.google.com", 443)) {
            System.out.println("created a socket !");
        } catch (Exception e) {
            System.out.println("creating socket error: " + e.getMessage());
        }
    }
}
