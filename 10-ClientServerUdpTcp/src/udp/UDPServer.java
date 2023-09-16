package udp;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            // Cr�er une socket UDP sur le port 9876
            socket = new DatagramSocket(9876);

            byte[] receiveData = new byte[1024];

            while (true) {
                // Attendre la r�ception d'un paquet UDP
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                // Extraire les donn�es du paquet
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Message re�u du client: " + message);

                // R�pondre au client
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String replyMessage = "Message re�u avec succ�s!";
                byte[] sendData = replyMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
