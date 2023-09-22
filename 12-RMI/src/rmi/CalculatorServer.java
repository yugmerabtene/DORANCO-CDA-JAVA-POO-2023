package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming; // Importez la classe Naming

// La classe du serveur doit impl�menter l'interface distante
public class CalculatorServer extends UnicastRemoteObject implements CalculatorInterface {

    // Constructeur par d�faut
    public CalculatorServer() throws RemoteException {
        super();
    }

    // Impl�mentation de la m�thode d'addition
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public static void main(String[] args) {
        try {
            // Cr�e un objet serveur
            CalculatorServer server = new CalculatorServer();

            // Cr�e un registre RMI sur le port 1099
            LocateRegistry.createRegistry(1099);

            // Lie l'objet serveur au registre RMI avec un nom
            Naming.rebind("CalculatorService", server);

            System.out.println("Serveur RMI pr�t.");
        } catch (Exception e) {
            System.err.println("Erreur du serveur RMI : " + e.toString());
            e.printStackTrace();
        }
    }
}
