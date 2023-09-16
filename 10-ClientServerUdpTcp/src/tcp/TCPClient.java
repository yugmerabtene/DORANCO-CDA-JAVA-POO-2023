package tcp;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            // Créer un socket client TCP pour se connecter au serveur sur le port 12345
            socket = new Socket("localhost", 12345);

            // Créer des flux de lecture/écriture pour la communication
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Envoyer un message au serveur
            String message = "Bonjour, serveur TCP!";
            out.println(message);

            // Attendre la réponse du serveur
            String replyMessage = in.readLine();
            System.out.println("Réponse du serveur: " + replyMessage);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null && !socket.isClosed()) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

