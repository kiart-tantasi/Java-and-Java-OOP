package com.example.socket;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

// NOTE: Run mock api first

public class SocketDemo {
    public static void main(String[] argv) {
        new SocketDemo().run("localhost");
    }

    protected void run(String hostName) {
        try (Socket sock = new Socket(hostName, 3000);) {
            PrintWriter os = new PrintWriter(sock.getOutputStream(), true);
            // Send the HTTP GET request
            os.println("GET / HTTP/1.1");
            os.println();

            // Read input
            BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("[LINE] " + line);
            }

            // Close the socket (this will also close the output stream)
            sock.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
