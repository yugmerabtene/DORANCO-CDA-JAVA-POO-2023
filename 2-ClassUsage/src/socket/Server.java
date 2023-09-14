package socket;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 12345; // Port sur lequel le serveur écoute
        
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Le serveur est en attente de connexions...");

            // Attendre une connexion du client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connexion établie avec le client.");

            // Créer des flux de communication avec le client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Lire les messages du client et y répondre
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Client : " + message);
                out.println("Serveur : Message reçu : " + message);
            }

            // Fermer les flux et les sockets
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
