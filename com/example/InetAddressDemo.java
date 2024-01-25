package com.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // look-up localhost address
        System.out.println("localhost addres: " + InetAddress.getLocalHost());

        // look-up by domain
        System.out.println("by domain: " + InetAddress.getByName("google.com").getHostAddress());

        // look-up by ip
        System.out.println("by ip: " + InetAddress.getByName("8.8.8.8").getHostName());

    }
}
