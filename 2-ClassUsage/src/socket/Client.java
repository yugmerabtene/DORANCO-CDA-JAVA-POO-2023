package socket;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Adresse IP du serveur
        int serverPort = 12345; // Port du serveur
        
        try {
            // �tablir une connexion avec le serveur
            Socket socket = new Socket(serverAddress, serverPort);

            // Cr�er des flux de communication avec le serveur
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Envoyer des messages au serveur
            out.println("Bonjour, serveur !");
            out.println("Comment �a va ?");
            out.println("Au revoir, serveur !");

            // Lire les r�ponses du serveur
            String response;
            while ((response = in.readLine()) != null) {
                System.out.println(response);
            }

            // Fermer les flux et la socket
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

