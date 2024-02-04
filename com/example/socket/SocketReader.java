package com.example.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketReader {
    public static void main(String[] argv) {
        String server_name = argv.length == 1 ? argv[0] : "localhost";

        try (Socket sock = new Socket(server_name, 3000);
                BufferedReader is = new BufferedReader(new InputStreamReader(sock.getInputStream()));) {
            System.out.println(" *** Connected to " + server_name + " ***");
            String msg = is.readLine();
            System.out.println("Msg: " + msg);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
