package com.cibertec;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static final int PORT = 13;

    public Server (){

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("1 >> Server Started on port "+PORT);
            while (true) {
                System.out.println("2 >> Waiting for client connection");
                Socket clientSocket = serverSocket.accept();
                System.out.println("3 >> New Cliente connect: "+ clientSocket.getInetAddress().getHostAddress());

                System.out.println("4 >> CLiente Completado");

                clientSocket.close();
                System.out.println("5 >> CLiente disconnected");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        new Server();
    }
}
