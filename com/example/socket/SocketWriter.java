package com.example.socket;

import java.io.PrintWriter;

import java.io.IOException;
import java.net.Socket;

public class SocketWriter {
    String mesg = "Hello World";

    public static void main(String[] argv) {
        new SocketWriter().run("localhost");
    }

    protected void run(String hostName) {
        try (Socket sock = new Socket(hostName, 3000);) {
            PrintWriter os = new PrintWriter(sock.getOutputStream(), true);
            os.print(mesg);
            os.flush();
            System.out.println("Sent \"" + mesg + "\"");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
