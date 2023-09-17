package clientServerMultiThreads;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MultiThreadedServer {

    public static void main(String[] args) {
        final int PORT = 12345;
        
        try {
            // Cr�er un serveur socket pour �couter les connexions entrantes
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Serveur en attente de connexions sur le port " + PORT);
            
            while (true) {
                // Accepter une connexion client
                Socket clientSocket = serverSocket.accept();
                System.out.println("Nouvelle connexion entrante.");
                
                // Cr�er un thread pour g�rer le client
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try {
            // Cr�er des flux de communication avec le client
            Scanner in = new Scanner(clientSocket.getInputStream());
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            
            // Envoyer un message de bienvenue au client
            out.println("Bienvenue sur le serveur !");
            
            // Traiter les requ�tes du client
            while (true) {
                // Lire le message du client
                String message = in.nextLine();
                
                // V�rifier si le client souhaite quitter
                if (message.equalsIgnoreCase("bye")) {
                    out.println("Au revoir !");
                    break;
                } else {
                    // R�pondre au client avec un �cho du message
                    out.println("Message re�u : " + message);
                }
            }
            
            // Fermer les flux et la connexion client
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
