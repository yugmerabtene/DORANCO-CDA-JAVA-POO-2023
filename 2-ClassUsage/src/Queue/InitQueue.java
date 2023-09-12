package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InitQueue {
    public static void main(String[] args) {
        // Cr�ation d'une file d'attente (queue) en utilisant LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enfilez des �l�ments dans la file d'attente
        queue.offer("Client 1");
        queue.offer("Client 2");
        queue.offer("Client 3");

        // Affichez la file d'attente
        System.out.println("File d'attente initiale : " + queue);

        // D�filez des �l�ments (retirez de la t�te de la file)
        String clientServi = queue.poll();
        System.out.println(clientServi + " est servi."); 

        // Affichez la file d'attente apr�s le service
        System.out.println("File d'attente apr�s service : " + queue);

        // Acc�dez � l'�l�ment en t�te de la file sans le retirer
        String prochainClient = queue.peek();
        System.out.println("Prochain client en attente : " + prochainClient);
    }
}
