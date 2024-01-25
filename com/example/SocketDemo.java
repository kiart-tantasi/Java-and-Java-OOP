package com.example;

import java.io.IOException;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args) throws IOException {
        // create a socket
        // somehow, it always throws error
        try (Socket socket = new Socket("localhost", 8080)) {
            System.out.println("created a socket");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
