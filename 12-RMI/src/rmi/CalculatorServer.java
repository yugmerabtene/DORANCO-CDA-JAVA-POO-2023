package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming; // Importez la classe Naming

// La classe du serveur doit implémenter l'interface distante
public class CalculatorServer extends UnicastRemoteObject implements CalculatorInterface {

    // Constructeur par défaut
    public CalculatorServer() throws RemoteException {
        super();
    }

    // Implémentation de la méthode d'addition
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public static void main(String[] args) {
        try {
            // Crée un objet serveur
            CalculatorServer server = new CalculatorServer();

            // Crée un registre RMI sur le port 1099
            LocateRegistry.createRegistry(1099);

            // Lie l'objet serveur au registre RMI avec un nom
            Naming.rebind("CalculatorService", server);

            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            System.err.println("Erreur du serveur RMI : " + e.toString());
            e.printStackTrace();
        }
    }
}
