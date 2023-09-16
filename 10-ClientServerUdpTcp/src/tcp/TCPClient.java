package tcp;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            // Cr�er un socket client TCP pour se connecter au serveur sur le port 12345
            socket = new Socket("localhost", 12345);

            // Cr�er des flux de lecture/�criture pour la communication
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Envoyer un message au serveur
            String message = "Bonjour, serveur TCP!";
            out.println(message);

            // Attendre la r�ponse du serveur
            String replyMessage = in.readLine();
            System.out.println("R�ponse du serveur: " + replyMessage);
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

