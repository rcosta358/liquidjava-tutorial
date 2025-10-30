package com.tutorial.part3;

import java.net.*;

public class ExampleSocketUsage {
    
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket();
        socket.bind(new InetSocketAddress("localhost", 8080)); // comment for error
        socket.connect(new InetSocketAddress("example.com", 80));
        socket.close();
    }
}
