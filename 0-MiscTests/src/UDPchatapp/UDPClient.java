package UDPchatapp;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class UDPClient {
    private static final int SERVER_PORT = 9876;
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Saisissez un message (ou 'exit' pour quitter) : ");
                String message = scanner.nextLine();

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);
                socket.send(sendPacket);

                byte[] receiveData = new byte[BUFFER_SIZE];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String botResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Réponse du bot : " + botResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
