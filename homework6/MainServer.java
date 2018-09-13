package com;

public class MainServer {

    public static void main(String[] args) {

        try {
            new ServerApp(8189).start();
        } catch (Exception e) {
            System.out.println("Клиент отсоединился и сервер прекратил работу");
        }
    }
}
