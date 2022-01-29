package com.example.orion.server;

import java.io.*;
import java.net.*;

public class OrionServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket s = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(s.getInputStream());

            String str = dataInputStream.readUTF();
            System.out.println("message= " + str);

            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
