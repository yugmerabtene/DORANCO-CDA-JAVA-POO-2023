package projetfinal;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int PORT = 12345;
    private static List<PrintWriter> clientWriters = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Serveur de chat d�marr� sur le port " + PORT);

            while (true) {
                new ClientHandler(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cette m�thode est utilis�e pour diffuser un message � tous les clients.
    public static synchronized void broadcastMessage(String message) {
        for (PrintWriter writer : clientWriters) {
            writer.println(message);
        }
    }

    // Classe interne pour g�rer chaque client
    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                // Ajouter le PrintWriter du client � la liste des clients
                synchronized (clientWriters) {
                    clientWriters.add(out);
                }

                // G�n�rer un nom d'utilisateur al�atoire pour le client
                String username = "Utilisateur" + (int) (Math.random() * 1000);
                out.println("Bienvenue, " + username + "! Pour quitter, saisissez /quit.");

                String message;
                while (true) {
                    message = in.readLine();
                    if (message == null || message.equals("/quit")) {
                        break;
                    }

                    // Diffuser le message � tous les clients
                    broadcastMessage(username + ": " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Retirer le PrintWriter du client de la liste des clients
                synchronized (clientWriters) {
                    clientWriters.remove(out);
                }
            }
        }
    }
}
