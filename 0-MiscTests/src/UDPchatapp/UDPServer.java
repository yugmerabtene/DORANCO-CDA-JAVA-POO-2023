package UDPchatapp;
import java.net.*;
import java.io.*;
import java.util.*;

public class UDPServer {
    private static final int SERVER_PORT = 9876;
    private static final int BUFFER_SIZE = 1024;
    private static HashMap<String, String> botResponses = new HashMap<>();

    public static void main(String[] args) {
        // Initialisation des r�ponses du bot
        botResponses.put("Bonjour", "Salut !");
        botResponses.put("Comment �a va ?", "Je suis un bot, je ne ressens rien.");
        botResponses.put("Quel est ton nom ?", "Je suis BotBot.");
        botResponses.put("Quelle est la capitale de la France ?", "La capitale de la France est Paris.");
        botResponses.put("Quelle est ta couleur pr�f�r�e ?", "Je suis un bot, je n'ai pas de pr�f�rences.");

        try (DatagramSocket socket = new DatagramSocket(SERVER_PORT)) {
            System.out.println("Serveur UDP en attente sur le port " + SERVER_PORT);

            while (true) {
                byte[] receiveData = new byte[BUFFER_SIZE];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());

                System.out.println("Message re�u du client " + clientAddress + ":" + clientPort + ": " + message);

                // Obtenir la r�ponse du bot en fonction du message pr�c�dent
                String botResponse = getBotResponse(message);
                byte[] sendData = botResponse.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getBotResponse(String message) {
        // Obtenir la r�ponse du bot en fonction du message pr�c�dent
        if (botResponses.containsKey(message)) {
            return botResponses.get(message);
        } else {
            return "Je ne comprends pas.";
        }
    }
}
