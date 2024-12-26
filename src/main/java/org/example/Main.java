package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    public void main(String[] args) {
        Server server = ServerBuilder.forPort(8080)
                .addService(new MessageService())
                .build();
        try {
            server.start();
            System.out.println("Server started at " + server.getPort());
            server.awaitTermination();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }}