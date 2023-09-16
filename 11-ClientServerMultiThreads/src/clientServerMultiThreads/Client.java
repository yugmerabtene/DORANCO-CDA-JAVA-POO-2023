package clientServerMultiThreads;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        final String SERVER_IP = "localhost";
        final int SERVER_PORT = 12345;
        
        try {
            // Créer une socket client et se connecter au serveur
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            
            // Recevoir le message de bienvenue du serveur
            String welcomeMessage = in.nextLine();
            System.out.println("Serveur : " + welcomeMessage);
            
            // Envoyer des messages au serveur
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Client : ");
                String message = scanner.nextLine();
                out.println(message);
                
                // Vérifier si le client souhaite quitter
                if (message.equalsIgnoreCase("bye")) {
                    break;
                }
            }
            
            // Fermer les flux et la connexion client
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
