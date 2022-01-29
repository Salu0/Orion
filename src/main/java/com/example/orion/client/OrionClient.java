package com.example.orion.client;

import com.example.orion.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.*;

public class OrionClient extends Application {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            launch();
            dataOutputStream.writeUTF("Hello Server");

            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
