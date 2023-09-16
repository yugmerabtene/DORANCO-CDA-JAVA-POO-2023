package udp;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            // Cr�er une socket UDP
            socket = new DatagramSocket();

            String message = "Bonjour, serveur UDP!";
            byte[] sendData = message.getBytes();

            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            // Cr�er un paquet UDP � envoyer au serveur
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

            // Envoyer le paquet au serveur
            socket.send(sendPacket);

            // Attendre une r�ponse du serveur
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            // Extraire et afficher la r�ponse du serveur
            String replyMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("R�ponse du serveur: " + replyMessage);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}

