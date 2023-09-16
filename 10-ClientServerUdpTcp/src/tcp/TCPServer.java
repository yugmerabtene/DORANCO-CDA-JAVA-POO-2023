package tcp;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            // Créer un socket serveur TCP lié au port 12345
            serverSocket = new ServerSocket(12345);
            System.out.println("Serveur TCP en attente de connexions...");

            while (true) {
                // Attendre qu'un client se connecte
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connecté depuis " + clientSocket.getInetAddress());

                // Créer des flux de lecture/écriture pour la communication
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Lire le message du client
                String message = in.readLine();
                System.out.println("Message reçu du client: " + message);

                // Répondre au client
                out.println("Message reçu avec succès!");

                // Fermer la connexion avec ce client
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null && !serverSocket.isClosed()) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

