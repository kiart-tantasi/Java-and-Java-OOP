package com.example.networking;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

// NOTE: Before running this file, you need to start mock-api first
// (at root)
// ```
// cd mock-api
// npm install
// node index.js
// ```

public class SocketDemo {
    public static void main(String[] argv) {
        new SocketDemo().run("localhost");
    }

    protected void run(String hostName) {
        System.out.println("Starting...");
        try (Socket sock = new Socket(hostName, 8080);) {
            System.out.println("Socket is connected...");
            // Create output-stream and connect to the socket to send HTTP request
            PrintWriter os = new PrintWriter(sock.getOutputStream(), true);
            // Send HTTP request
            os.println("GET / HTTP/1.1");
            os.println();
            // Read input-stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("[LINE] " + line);
            }
            // Close the socket (this will also close the output stream)
            sock.close();
            System.out.println("Socket is closed...");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
