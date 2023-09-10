package UDPchatapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class ImprovedUDPChatApplication extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DatagramSocket socket;
    private InetAddress serverAddress;
    private int serverPort = 9876; // Port UDP du serveur
    private JTextField messageField;
    private JTextArea chatArea;
    private String username;

    public ImprovedUDPChatApplication() {
        try {
            socket = new DatagramSocket(); // Cr�e un socket UDP
            serverAddress = InetAddress.getByName("127.0.0.1"); // Adresse IP du serveur
        } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        }

        setTitle("Chat UDP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Demande � l'utilisateur son pseudonyme
        username = JOptionPane.showInputDialog("Entrez votre pseudonyme :");

        messageField = new JTextField();
        chatArea = new JTextArea();
        chatArea.setEditable(false);

        // Ajoute une barre de d�filement � la zone de chat
        JScrollPane scrollPane = new JScrollPane(chatArea);

        // Cr�e un bouton pour envoyer les messages
        JButton sendButton = new JButton("Envoyer");
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        // Agencement des composants � l'aide de BorderLayout
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(messageField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        // D�marrer un thread pour �couter les messages entrants
        Thread listenerThread = new Thread(new MessageListener());
        listenerThread.start();
    }

    private void sendMessage() {
        try {
            String message = messageField.getText();
            if (!message.isEmpty()) {
                String formattedMessage = "[" + username + "] " + message; // Ajoute le pseudonyme au message
                byte[] sendData = formattedMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                socket.send(sendPacket);

                // Affiche le message dans la zone de chat
                chatArea.append(formattedMessage + "\n");
                messageField.setText(""); // Efface le champ de message apr�s l'envoi
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class MessageListener implements Runnable {
        @Override
        public void run() {
            try {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                while (true) {
                    socket.receive(receivePacket);
                    String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());

                    // Affiche le message re�u dans la zone de chat
                    chatArea.append(receivedMessage + "\n");

                    // Ajoute un bot pour r�pondre aux messages
                    if (receivedMessage.toLowerCase().contains("bot")) {
                        respondToBot(receivedMessage);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void respondToBot(String receivedMessage) {
        // Cr�e un ensemble de r�ponses possibles du bot
        ArrayList<String> botResponses = new ArrayList<>();
        botResponses.add("Je suis un bot.");
        botResponses.add("Salut, je suis le bot !");
        botResponses.add("Bot ici, que puis-je faire pour vous ?");

        // S�lectionne une r�ponse au hasard
        Random random = new Random();
        String botResponse = botResponses.get(random.nextInt(botResponses.size()));

        // Affiche la r�ponse du bot dans le chat
        chatArea.append("Bot : " + botResponse + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ImprovedUDPChatApplication chatApp = new ImprovedUDPChatApplication();
                chatApp.setVisible(true);
            }
        });
    }
}
