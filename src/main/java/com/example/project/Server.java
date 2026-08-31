package com.example.project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static final int PORT = 8889;
    private static final ArrayList<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Chat server started on port " + PORT);
            while (true) {
                System.out.println("Waiting for clients...");
                Socket socket = serverSocket.accept();
                System.out.println("Connected");
                ClientHandler clientThread = new ClientHandler(socket, clients);
                clients.add(clientThread);
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void startInBackground() {
        Thread serverThread = new Thread(() -> main(new String[0]), "chat-server");
        serverThread.setDaemon(true);
        serverThread.start();
    }
}
